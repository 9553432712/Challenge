package com.mahesh.dbpolling;

import com.impossibl.postgres.api.jdbc.PGConnection;
import com.impossibl.postgres.api.jdbc.PGNotificationListener;
import com.impossibl.postgres.jdbc.PGDataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ListenNotify
{
	// Create the queue that will be shared by the producer and consumer
	private BlockingQueue queue = new ArrayBlockingQueue(10);	
	// Database connection
	PGConnection connection;
	
	public ListenNotify() throws SQLException
	{	
		
		// Create the listener callback
		//Statement s = connection.createStatement();
        PGNotificationListener listener = new PGNotificationListener()
		{
			public void notification(int processId, String channelName, String payload)
			{
				
			// Add event and payload to the queue
				queue.add("/channels/" + channelName + " " + payload);
			}
		};
		
		try
		{
			// Create a data source for logging into the db
			PGDataSource dataSource = new PGDataSource();
			dataSource.setHost("52.59.240.241");
			dataSource.setPort(30404);
			dataSource.setDatabaseName("thingsboard");
			dataSource.setUser("postgres");
			dataSource.setPassword("postgres");
			
			// Log into the db
			connection = (PGConnection) dataSource.getConnection();
			
			// add the callback listener created earlier to the connection
			connection.addNotificationListener(listener);
			
			// Tell Postgres to send NOTIFY q_event to our connection and listener
			Statement statement = connection.createStatement();
			statement.execute("LISTEN job_status");
			
			statement.close();
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	* @return shared queue
	*/
	public BlockingQueue getQueue()
	{
		return queue;
	}
	
	/**
	*
	* main entry point
	*
	* @param args
	 * @throws SQLException 
	*/
	public static void main(String[] args) throws SQLException
	{
		// Create a new listener
		ListenNotify ln = new ListenNotify();
		
		// Get the shared queue
		BlockingQueue queue = ln.getQueue();
		
		// Loop forever pulling messages off the queue
		while (true)
		{
			try
			{
				// queue blocks until something is placed on it
				String msg = (String) queue.take();
			
				// Do something with the event
				System.out.println(msg);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
package comd.sample;



import com.impossibl.postgres.api.jdbc.PGConnection;
import com.impossibl.postgres.api.jdbc.PGNotificationListener;
import com.impossibl.postgres.jdbc.PGDataSource;
import org.postgresql.PGNotification;
import org.postgresql.core.Encoding;
import org.postgresql.fastpath.Fastpath;
import org.postgresql.largeobject.LargeObjectManager;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPollingListener extends Thread {
    static PGConnection connection = null;
    static PGDataSource dataSource = new PGDataSource();

    public static void main(String args[]) {
        try {
            new DBPollingListener().setDaemon(true);
            new DBPollingListener().start();
        }catch(Exception e){}
    }

    public void run() {
        listenToNotifyMessage();

        try {
            Statement s = connection.createStatement();
            s.executeUpdate("listen command");
            s.executeUpdate("notify command, here");
            s.close();
           // Class[] params = null;
            //Method method =(dataSource.getConnection().getClass()).getMethod("getUnderlyingConnection", params);

            //com.impossibl.postgres.jdbc.PGDirectConnection conn =  com.impossibl.postgres.jdbc.PGDirectConnection.class.newInstance();
            try {
                com.impossibl.postgres.jdbc.PGDirectConnection conn = (com.impossibl.postgres.jdbc.PGDirectConnection) dataSource.getConnection();
                Statement statement = connection.createStatement();
                statement.execute("LISTEN test_notify");
                statement.close();
                // it only works if the connection is open. Therefore, we do an endless loop here.
//                while (true) {
//                    Thread.sleep(500);
//                }
            } catch (Exception e) {
                System.err.println(e);
            }

            org.postgresql.PGConnection conn1 = (org.postgresql.PGConnection) dataSource.getConnection().unwrap(org.postgresql.PGConnection.class);
            for (PGNotification n : conn1.getNotifications()) {
                System.out.println(String.format("%s, %s, %s",
                        n.getPID(), n.getName(), n.getParameter()));
            }
        } catch (Exception e) {
            try {
                Class[] params = null;
                Method method =(connection.getClass()).getMethod("getUnderlyingConnection", params);
                connection = (PGConnection) dataSource.getConnection();
            } catch(Exception e1){}
            System.out.println("Notification Listener failed2..." + e.getLocalizedMessage());
        }
    }

    public static void listenToNotifyMessage() {
        dataSource.setHost("52.59.240.241");
        dataSource.setPort(30404);
        dataSource.setDatabaseName("thingsboard");
        dataSource.setUser("postgres");
        dataSource.setPassword("postgres");

                try {
                    connection = (PGConnection) dataSource.getConnection();
                    Statement statement = connection.createStatement();
                    statement.execute("LISTEN test_notify");
                    //statement.close();
                    //connection.addNotificationListener(listener);
                    connection.addNotificationListener(new PGNotificationListener() {

                        public void notification(int processId, String channelName, String payload) {

                            System.out.println("*********INSIDE NOTIFICATION*************");

                            System.out.println("Payload: " + payload);
                        }
                            //PGNotificationListener listener = (Integer processId, String channelName, String payload)
                            //   -->System.out.println("notification = " + payload);
                    });
                    }catch(Exception e){
                    System.out.println("Notification Listener failed1..." + e.getLocalizedMessage());
                }
                }
}


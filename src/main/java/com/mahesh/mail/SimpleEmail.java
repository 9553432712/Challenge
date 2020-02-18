package com.mahesh.mail;

import javax.mail.Session;
import java.util.Properties;

public class SimpleEmail {
	
	public static void main(String[] args) {
		
	    System.out.println("SimpleEmail Start");
		
	    String smtpHostServer = "mail.corinex.com";
	    String emailID = "mahesh.rvrjc@gmail.com";
	    
	    Properties props = System.getProperties();

	    props.put("mail.smtp.host", smtpHostServer);

	    Session session = Session.getInstance(props, null);
	    
	    EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
	}

}
package com.example.MailApp.Mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender {

	private static Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending the MMock mail to: " + to);
		log.info("The subject of the Mock Mail: " + subject);
		log.info("The body of the Mock Mail: " + body);
	}

}

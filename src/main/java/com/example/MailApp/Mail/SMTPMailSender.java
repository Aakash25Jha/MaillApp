package com.example.MailApp.Mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SMTPMailSender implements MailSender {

	private static Log log = LogFactory.getLog(SMTPMailSender.class);

	private JavaMailSender javaMailSender;

	@Override
	public void send(String to, String subject, String body) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true);
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);

		javaMailSender.send(message);
	}

	public SMTPMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

}

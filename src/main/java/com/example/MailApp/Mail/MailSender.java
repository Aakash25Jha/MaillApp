package com.example.MailApp.Mail;

import javax.mail.MessagingException;

public interface MailSender 
{
	public void send(String to, String subject, String body) throws MessagingException;  
}

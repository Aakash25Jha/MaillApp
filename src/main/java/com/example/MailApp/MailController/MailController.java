package com.example.MailApp.MailController;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MailApp.Mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	public MailController(MailSender anything) {
		this.mailSender = anything;
	}

	@RequestMapping(path = "/mail")
	public String mail() throws MessagingException {
		mailSender.send("mbathija97@gmail.com", "Learning",
				"I am learning dependency injection and sending you a mail using smtp mail service");
		return "Mail sent to reciever";
	}

}

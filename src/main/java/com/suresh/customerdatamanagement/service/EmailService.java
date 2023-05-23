package com.suresh.customerdatamanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.suresh.customerdatamanagement.entity.Email;

//public class EmailService {
//
//	@Autowired
//	private JavaMailSender javaMailSender;
//
//	public void emailSender(Email email) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		
//		message.setFrom("sureshstark3@gmail.com");
//		message.setTo(email.getTo());
//		message.setSubject(email.getSubject());
//		message.setText(email.getMessage());
//		
//		 javaMailSender.send(message);
//		
//	}
//
//}

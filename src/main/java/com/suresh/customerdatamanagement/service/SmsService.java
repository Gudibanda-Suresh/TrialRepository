//package com.suresh.customerdatamanagement.service;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//import lombok.extern.slf4j.Slf4j;
////
////@Service
////@Slf4j
////public class SmsService {
////	
////	@Value("${TWILIO_ACCOUNT_SID}")
////	
////	String ACCOUNT_SID;
////	
////	@Value("${TWILIO_AUTH_TOKEN}")
////	String AUTH_TOKEN;
////	
////	@Value("${TWILIO_NUMBER}")
////	String NUMBER;
////	
////	
////	
////	@PostConstruct
////	private void setup()
////	{
////		log.info("ACCOUNT_SID : "+ACCOUNT_SID);
////		
////		Twilio.init(ACCOUNT_SID,AUTH_TOKEN );
//////	}
//////	
////	
////	public String smsSender(String smsMessage,String number)
////	{
////		Message message = Message.creator(new PhoneNumber(number),
////				new PhoneNumber(NUMBER),smsMessage).create();
////		
////		return message.getStatus().toString();
////		
////		
////	}
////
////}

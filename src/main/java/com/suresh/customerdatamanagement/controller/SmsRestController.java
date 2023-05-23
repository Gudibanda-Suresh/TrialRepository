package com.suresh.customerdatamanagement.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.suresh.customerdatamanagement.entity.SmsEntity;
//import com.suresh.customerdatamanagement.service.SmsService;
//
////@RestController
//public class SmsRestController {
//	
//	
//	
//	@Autowired
//	private SmsService smsService;
//	
//	
//	
//	@PostMapping("/smsSender")
//	public String smsSender( @RequestBody SmsEntity sms)
//	{
//		return smsService.smsSender(sms.getDestination(),sms.getNumber());
//	}
//
//}

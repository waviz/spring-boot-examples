package com.waviz.sendgrid.service;

import com.waviz.sendgrid.pojo.EmailPojo;




public interface SendGridService {
	
	public String sendMail(EmailPojo emailPojo);
}

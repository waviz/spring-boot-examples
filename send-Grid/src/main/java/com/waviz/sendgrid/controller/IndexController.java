package com.waviz.sendgrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waviz.sendgrid.pojo.EmailPojo;
import com.waviz.sendgrid.service.SendGridService;


@RestController
public class IndexController {

	@Autowired
	SendGridService sendGridService;

	@RequestMapping(value = "/email/", method = RequestMethod.POST)
	public String index(@RequestBody EmailPojo emailPojo) {
		String response = sendGridService.sendMail(emailPojo);
		return response;
	}

}

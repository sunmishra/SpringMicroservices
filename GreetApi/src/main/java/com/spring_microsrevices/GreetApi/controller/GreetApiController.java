package com.spring_microsrevices.GreetApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_microsrevices.client.WelcomeFeigenClient;

@RestController
public class GreetApiController {
	
//	@Autowired
//	private WelcomeFeigenClient welcomeFeigenClient;

	private WelcomeFeigenClient welcomeFeigenClient;


	GreetApiController(WelcomeFeigenClient welcomeFeigenClient) {
		this.welcomeFeigenClient = welcomeFeigenClient;
	}
	
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String oldmsg = " Dobara dikh mat Jana!!!";
		String fiegenClientMsg = welcomeFeigenClient.getWelcomeMsg();
		
		return  fiegenClientMsg + oldmsg;
	}
	
	

}

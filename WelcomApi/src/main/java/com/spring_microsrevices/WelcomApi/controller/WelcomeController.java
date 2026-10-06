package com.spring_microsrevices.WelcomApi.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private Environment env; // to access env properties passed through cmd line or configs
    public WelcomeController(Environment env) {
        this.env = env;
    }
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
        String port = env.getProperty("server.port");
		return "Phir se aa gya "+ port +"...";
	}
	

}

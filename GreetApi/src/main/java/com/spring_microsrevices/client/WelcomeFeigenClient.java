package com.spring_microsrevices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("WelcomeApi")
public interface WelcomeFeigenClient {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}

package com.spring_microsrevices.GreetApi;

import com.spring_microsrevices.client.WelcomeFeigenClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = WelcomeFeigenClient.class)
@EnableDiscoveryClient
public class GreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiApplication.class, args);
	}

}

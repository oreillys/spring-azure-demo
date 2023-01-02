package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringAzureDemoApplication {


	@GetMapping("/message")
	public String message() {
		return "Congrats, Orly! Your app deployed successfully in Azure";	
	}
	
	@GetMapping("/message2")
	public String message() {
		return "Hey good lookin'! Congrats! Your app deployed successfully in Azure";	
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}

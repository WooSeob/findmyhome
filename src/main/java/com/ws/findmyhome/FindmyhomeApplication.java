package com.ws.findmyhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FindmyhomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindmyhomeApplication.class, args);
	}

}

package com.project.api.consumeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeapiApplication.class, args);
	}

}

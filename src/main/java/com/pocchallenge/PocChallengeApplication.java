package com.pocchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PocChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocChallengeApplication.class, args);
	}

}

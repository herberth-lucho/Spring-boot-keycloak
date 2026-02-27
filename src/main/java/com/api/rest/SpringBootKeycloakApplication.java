package com.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKeycloakApplication {

	/**
	 * form-urlencoded
	 * client_id:spring-client-api-rest
	 * grant_type:password
	 * username:herberth.lucho
	 * password:1234
	 * client_secret:FnWhodimul7OSYwQuX3WxDqhvVLCF1WP
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKeycloakApplication.class, args);
	}

}

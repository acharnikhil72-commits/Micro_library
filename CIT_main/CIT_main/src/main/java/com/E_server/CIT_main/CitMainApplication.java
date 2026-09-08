package com.E_server.CIT_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CitMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitMainApplication.class, args);
	}

}

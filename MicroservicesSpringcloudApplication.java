package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer//enabling spring-cloud server
@SpringBootApplication
public class MicroservicesSpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSpringcloudApplication.class, args);
	}

}

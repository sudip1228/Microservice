package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//microservices are registered to eureka server so  that their all instances can be accessed through one place.
//now ribbon uses eureka server to receive information of multiple instances.
public class MicroservicesEurekaNamingServerApplication {
//follow following step while running an application
	//1)run eureka server 2)run microservices in sequence(currency exchange) 3)run another microservice(currency converter application)
	//if you are running another instance of currency exchange then you have to run currency converter again to get that change.
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaNamingServerApplication.class, args);
	}

}

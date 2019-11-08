package Zuul;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy//using zuul
@EnableDiscoveryClient//using eureka server
public class MicroservicesZuulApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesZuulApIgatewayApplication.class, args);
	}
//format to use  zuul in website is as follow.
	//   localhost:8765/{application name}/{uri}
	//example-- http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR
	//here above "currency-exchange-service" is application name and "currency-exchange/from/USD/to/INR" is uri.
	//now currency exchange service is passed through API gateway(Zuul).
	//now zuul is called before any application is executed because we have put "pre" in zuullogging filter class.We can see this in log.
	
	
	@Bean
	public Sampler defaultSampler(){//adding spring sleuth to monitor the request.
		return Sampler.ALWAYS_SAMPLE;
	}
}

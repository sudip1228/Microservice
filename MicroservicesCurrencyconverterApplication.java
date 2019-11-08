package currency.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("currency.converter")//feign makes it easy to connect other microservices.
@EnableDiscoveryClient

public class MicroservicesCurrencyconverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCurrencyconverterApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){//adding spring sleuth to monitor the request.
		return Sampler.ALWAYS_SAMPLE;
	}
}

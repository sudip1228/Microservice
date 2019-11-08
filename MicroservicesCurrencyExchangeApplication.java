package currency.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesCurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCurrencyExchangeApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){//adding spring sleuth to monitor the request.
		return Sampler.ALWAYS_SAMPLE;
	}
}

package limit_services;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableHystrix//using for fault tolerance.If this microservice is dowm, hystrix prevents the system failure.
public class LimitsServiceApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplicationRunner.class, args);
	}

}

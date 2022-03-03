package com.sbms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayServiceApplication {
	
	private static Logger logger = LoggerFactory.getLogger(CloudGatewayServiceApplication.class);

	public static void main(String[] args) {
		logger.info("Inside Spring Boot Main Service class");
		SpringApplication.run(CloudGatewayServiceApplication.class, args);
	}
	
	@Bean
	public Sampler createSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}

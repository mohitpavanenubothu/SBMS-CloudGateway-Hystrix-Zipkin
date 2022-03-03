package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms04CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms04CloudGatewayApplication.class, args);
	}

}

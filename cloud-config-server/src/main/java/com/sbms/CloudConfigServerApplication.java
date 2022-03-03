package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("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");
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}

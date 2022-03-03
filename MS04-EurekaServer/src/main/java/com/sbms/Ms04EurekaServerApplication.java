package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms04EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms04EurekaServerApplication.class, args);
	}

}

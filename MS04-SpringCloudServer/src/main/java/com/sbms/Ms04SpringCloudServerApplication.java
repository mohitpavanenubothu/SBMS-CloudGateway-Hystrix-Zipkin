package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Ms04SpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms04SpringCloudServerApplication.class, args);
	}

}

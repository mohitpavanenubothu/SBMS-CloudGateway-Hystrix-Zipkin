package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms04EmpRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms04EmpRestServiceApplication.class, args);
	}

}

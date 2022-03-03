package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class Ms05HystrixDashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms05HystrixDashBoardApplication.class, args);
	}

}

package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Ms03GatewayZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms03GatewayZuulServerApplication.class, args);
	}

}

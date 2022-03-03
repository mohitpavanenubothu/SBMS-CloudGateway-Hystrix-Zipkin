package com.sbms.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sbms.client.IEmployeeServiceRestConsumer;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	int count = 0;

	Logger logger = LoggerFactory.getLogger(ConsumerController.class);

	@Autowired
	private IEmployeeServiceRestConsumer feignConsumer;

	@GetMapping("/welcome")
	public String wishMsg() {
		logger.info("Inside ConsumerController wishMsg method");
		return "Consumer second-Service" + feignConsumer.fetchFirstServiceData();
	}

	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "bookFallbackTicket", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true") })
	public String bookTicket() {
		logger.info("Inside the TicketBookingController for circuit breaker");
		if (new Random().nextInt(10) < 8)
			throw new RuntimeException("Problem occured in actual method");
		return "Fault tolerance Hystrix circuit breaker success";
	}

	public String bookFallbackTicket() {
		count++;
		System.out.println("TicketBookingController.bookFallbackTicket()" + count);
		logger.info("Inside bookFallback method");
		return "Please try later-Server is under maintainance";
	}

}

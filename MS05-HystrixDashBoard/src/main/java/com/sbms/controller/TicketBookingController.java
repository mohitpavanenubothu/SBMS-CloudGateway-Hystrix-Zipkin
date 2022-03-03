package com.sbms.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ticket")
@Slf4j
public class TicketBookingController {

	int count = 0;

	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "bookFallbackTicket", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true") })
	public String bookTicket() {
		log.info("Inside the TicketBookingController for circuit breaker");
		if (new Random().nextInt(10) < 8)
			throw new RuntimeException("Problem occured in actual method");
		return "Fault tolerance Hystrix circuit breaker success";
	}

	public String bookFallbackTicket() {
		count++;
		System.out.println("TicketBookingController.bookFallbackTicket()" + count);
		log.info("Inside bookFallback method");
		return "Please try later-Server is under maintainance";
	}

}

package com.sbms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Value("${server.port}")
	private int port;

	@GetMapping("/info")
	public String getBillingInfo() {
		logger.info("Welcome to Employee Module getBillingInfo method");
		return "we accept   Card Payment , UPI Payment,  NetBaking Payment, COD---> port::" + port;
	}

	@GetMapping("/wish")
	public String getMessage() {
		logger.info("Welcome to Employee Module getMessage method");
		return "Employee First-Service " + port;
	}

}

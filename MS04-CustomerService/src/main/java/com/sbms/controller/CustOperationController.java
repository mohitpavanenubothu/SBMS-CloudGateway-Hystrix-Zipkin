package com.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/custService")
@Slf4j
public class CustOperationController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/empservice")
	public ResponseEntity<String> getDataService() {
		log.info("Inside userService MS");
		ResponseEntity<String> response=template.getForEntity("http://localhost:9910/emp/show", String.class);
		return response;		
	}

}

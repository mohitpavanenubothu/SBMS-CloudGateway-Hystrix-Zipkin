package com.sbms.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchServiceController {

	@PostMapping("/wish")
	public ResponseEntity<String> getWish() {
		String body = null;
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();

		if (hour < 12)
			body = "Good Morning";
		else if (hour < 16)
			body = "Good Afternoon";
		else if (hour < 20)
			body = "Good Evening";
		else
			body = "Good Night";

		HttpStatus status = HttpStatus.OK;
		ResponseEntity<String> response = new ResponseEntity<String>(body, status);
		return response;
	}

}

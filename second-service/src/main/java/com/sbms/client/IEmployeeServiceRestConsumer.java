package com.sbms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("first-service")
public interface IEmployeeServiceRestConsumer {
	
	@GetMapping("/employee/info")
	public String fetchFirstServiceData();

}

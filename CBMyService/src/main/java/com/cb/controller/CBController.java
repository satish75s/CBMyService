package com.cb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.client.CBExternalService;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping
public class CBController {
   
	
	
	@Autowired
	CBExternalService myService1;
	
	private static final String SAMPLE_SERVICE = "sampleService";
	
 	@GetMapping("/myService")	
	// Circuit Breaker applied to this method
	@CircuitBreaker(name = SAMPLE_SERVICE, fallbackMethod = "fallback")
	public String callExternalService() {
 		return myService1.externalMsg();
		
	}

	// Fallback method if the circuit breaker opens
	public String fallback(Throwable throwable) {
		// Return a fallback response in case of failure
		return "Fallback response due to: " + throwable.getMessage();
	}
	}

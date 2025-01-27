/*
 * package com.cb.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
 * 
 * 
 * 
 * @Service public class MyService {
 * 
 * @Autowired RestTemplate restTemplate; private static final String
 * SAMPLE_SERVICE = "sampleService"; // Circuit Breaker applied to this method
 * 
 * @CircuitBreaker(name = SAMPLE_SERVICE, fallbackMethod = "fallback") public
 * String callExternalService() { // Simulate an external service call (e.g.,
 * HTTP request) String url = "http://localhost:8080/call_external_service"; //
 * External service URL return restTemplate.getForObject(url, String.class); }
 * 
 * // Fallback method if the circuit breaker opens public String
 * fallback(Throwable throwable) { // Return a fallback response in case of
 * failure return "Fallback response due to: " + throwable.getMessage(); } }
 */
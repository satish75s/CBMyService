package com.cb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="externalService",url="http://localhost:8080")
public interface CBExternalService {
	@GetMapping("/call_external_service")
	public String externalMsg();
}

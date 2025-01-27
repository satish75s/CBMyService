package com.cb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CbMyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbMyServiceApplication.class, args);
	}

}

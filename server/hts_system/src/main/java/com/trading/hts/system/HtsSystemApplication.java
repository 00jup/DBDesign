package com.trading.hts.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HtsSystemApplication {
	private static final Logger logger = LoggerFactory.getLogger(HtsSystemApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HtsSystemApplication.class, args);
		logger.info("Application started successfully on http://localhost:8080");
	}
}
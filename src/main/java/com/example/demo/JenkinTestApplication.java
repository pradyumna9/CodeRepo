package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinTestApplication {

	private Logger logge = LoggerFactory.getLogger(JenkinTestApplication.class);
	@PostConstruct
	public void init() {
		logger.info("SpringBoot Application started--------->>>>>>");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinTestApplication.class, args);
	}

}

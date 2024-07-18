package com.ottistech.indespensa.api.ms_indespensa_tracking;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
public class MsIndespensaTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIndespensaTrackingApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/v1")
	public class HelloWorld {

		@GetMapping("/hello")
		public String hello() {
			return "Hello World";
		}
	}
}

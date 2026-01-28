package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControoller {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello CI-CD pipeline has been implemented ";
	}
}
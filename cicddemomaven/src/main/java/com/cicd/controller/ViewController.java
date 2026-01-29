package com.cicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/welcome")
	public String welcomePage() {
		System.out.println("View request received");
		return "welcome";
	}
}

package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "hello-world-pankaj-sir-academy-happy-pankaj sir academy";
	}

}

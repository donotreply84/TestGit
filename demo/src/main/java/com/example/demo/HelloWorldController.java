package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/sayHello")
		public String sayHello() {
			return "Hello World Springboot!!";
		}
	}


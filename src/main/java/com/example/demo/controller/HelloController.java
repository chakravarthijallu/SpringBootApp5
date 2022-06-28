package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/customers")
	public String getAllCustomers() {
		return "Hello I am Nithin";
	}
	
	@GetMapping("/products")
	public String getAllProducts() {
		return "Hello I am Pens";
	}
	
	

}

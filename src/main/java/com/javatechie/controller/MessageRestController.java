package com.javatechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageRestController {

	@GetMapping("/show")
	public String showMessage() {
		return "WELCOME TO JAVATECHIE, NOIDA";
	}
}
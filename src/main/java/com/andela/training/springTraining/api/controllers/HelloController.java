package com.andela.training.springTraining.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class HelloController {
	

	@GetMapping("/test1")
	public String testeAPI() {
		return "Hello, I am a API";
	}
}

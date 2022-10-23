package fr.poc.client1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.poc.client1.properties.MyPersonProperties;

@RestController
public class HelloWorldController {
	
	final MyPersonProperties properties;
	
	public HelloWorldController(MyPersonProperties properties) {
		this.properties = properties;
	}

	@GetMapping("/hello")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/hello/env")
	public String greeting() {
		return "Hello "+properties.getFirstName();
	}

}

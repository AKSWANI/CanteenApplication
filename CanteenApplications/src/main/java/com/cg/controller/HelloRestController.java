package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //@Controller+@ReponseBody
@RequestMapping("/api")
public class HelloRestController {

	@RequestMapping(value="/hello")
	public String sayHello() {
		System.out.println("hello...");
		return "Hello cg! fromSpring Framework!";
	}
}

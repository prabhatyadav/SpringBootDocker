package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@RequestMapping(path="/helloWorld",method=RequestMethod.GET)
	public String  sayHelloWorld() {
	 return "Hello World";	
	}
	
	@RequestMapping(path="/hello/{name}",method=RequestMethod.GET)
	public String  sayHelloPathVariable(@PathVariable("name") String subject) {
	 return "Hello "+subject;	
	}
	
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public String  sayHelloQueryParameter(@RequestParam("name") String name) {
	 return "Hello "+name;	
	}
	
}

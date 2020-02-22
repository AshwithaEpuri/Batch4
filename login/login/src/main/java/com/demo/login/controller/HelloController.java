package com.demo.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hello")

public class HelloController {
	 @GetMapping("/display")
	public String helloDisplay()
	{
		return "hello!! welcome to rest API";
	}
	 @GetMapping("/display/{employeeId}")
	 public String returnDisplay(@PathVariable("employeeId") int eId)
	 {
		 return "hello" +eId+ "welcome";
	 }
}

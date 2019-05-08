package com.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLastName {
	
	@RequestMapping(method = RequestMethod.GET, value = "/lastName")
	public String getLastName() {
		return "Swarnkar";
	}
}

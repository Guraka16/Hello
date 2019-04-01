package com.hari.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	
	@Autowired
	Service service;
	
	@RequestMapping("/")
	public String home()
	{
		return service.getResult();
	}
}

package com.wipro.OktaOauthRP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller /// Note difference between controller and rest controller annoted class
public class MyProtectController {
	
	
	
	@RequestMapping(name="/", method=RequestMethod.GET)
	public String doSomething() {
		
		String output = "<html> <body> <h1> Hello Wipro. I am Oauth Protected</h1></body><html>"; 
		
		return output;
		
		
	}

}

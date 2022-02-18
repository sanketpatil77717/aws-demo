package com.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ccf")
public class HomeController {
	
	@GetMapping("/home")
	public ResponseEntity<String> welcomeUser()
	{
		return new ResponseEntity<String>("Welcome Shubham, Kasa ahes BHAVA",HttpStatus.OK);
	}

}

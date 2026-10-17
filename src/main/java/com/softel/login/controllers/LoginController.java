package com.softel.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softel.login.dto.Registration;
import com.softel.login.service.LoginService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/registerUser")
	public String register(@RequestBody Registration registrant) {
		
		loginService.saveRegistration(registrant);
		
		return "A new " + registrant.getRole() + " has been registered.";
	}
	
	@GetMapping("/admin")
	public String adminTest() {
		
		return "The admin function works well.";
	}
	
	@GetMapping("/users")
	public String userTest() {
		
		return "The user function works well.";
	}
	
	@GetMapping("/visitor")
	public String visitorTest() {
		
		return "The visitor function works well.";
	}
	
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody Registration registrant) {
		
		return "The user with the " + registrant.getRole() + " role has been updated.";
	}
}

package edu.uoengland.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uoengland.login.dto.Registration;
import edu.uoengland.login.service.LoginService;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/registerUser")
	public String register(@RequestBody Registration registrant) {
		
		loginService.saveRegistration(registrant);
		
		return "A new consumer has been registered.";
	}
	
	@GetMapping("/admin")
	public String adminTest() {
		
		return "The admin function works well.";
	}
	
	@GetMapping("/faculty")
	public String facultyTest() {
		
		return "The faculty function works well.";
	}
	
	@GetMapping("/student")
	public String studentTest() {
		
		return "The student function works well.";
	}
	
	@GetMapping("/visitor")
	public String visitorTest() {
		
		return "The visitor function works well.";
	}
}

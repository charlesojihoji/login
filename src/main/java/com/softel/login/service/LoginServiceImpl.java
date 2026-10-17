package com.softel.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.softel.login.dto.Registration;
import com.softel.login.entity.Users;
import com.softel.login.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public String saveRegistration(Registration registrant) {

		Users theUser = new Users();
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		theUser.setFullName(registrant.getFullName());
		theUser.setEmailAddress(registrant.getEmailAddress());
		theUser.setPhoneNumber(registrant.getPhoneNumber());
		theUser.setPassword(encoder.encode(registrant.getPassword()));
		theUser.setRole(registrant.getRole().toUpperCase());
		
		loginRepository.save(theUser);
		
		return "A new User or Admin has successfully been registered.";
	}

	@Override
	public void updateUser(Registration registrant) {

		Optional<Users> user = loginRepository.findById(registrant.getUserId());
		
		if(!user.isEmpty()) {
			
			user = Optional.ofNullable(user.get());
			
			user.set
		}
	}
	

}

package edu.uoengland.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.uoengland.login.dto.Registration;
import edu.uoengland.login.entity.Consumer;
import edu.uoengland.login.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public String saveRegistration(Registration registrant) {

		Consumer theConsumer = new Consumer();
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		theConsumer.setFullName(registrant.getFullName());
		theConsumer.setEmailAddress(registrant.getEmailAddress());
		theConsumer.setPhoneNumber(registrant.getPhoneNumber());
		theConsumer.setPassword(encoder.encode(registrant.getPassword()));
		theConsumer.setRole(registrant.getRole().toUpperCase());
		
		loginRepository.save(theConsumer);
		
		return "A new Consumer or Admin has successfully been registered.";
	}

}

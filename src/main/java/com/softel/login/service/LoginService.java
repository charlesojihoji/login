package com.softel.login.service;

import com.softel.login.dto.Registration;

public interface LoginService {

	String saveRegistration(Registration registrant);

	void updateUser(Registration registrant);

}

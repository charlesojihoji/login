package com.softel.login.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.softel.login.entity.Users;
import com.softel.login.repository.LoginRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final LoginRepository loginRepository;

    public CustomUserDetailsService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String emailAddress) throws UsernameNotFoundException {
        Users user = loginRepository.findByEmailAddress(emailAddress)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + emailAddress));
        return User.builder()
                .username(user.getEmailAddress())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();

    }
}
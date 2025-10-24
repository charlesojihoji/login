package edu.uoengland.login.tempencoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("1tom*B@tw2"));
		System.out.println(encoder.encode("24rese@rch#*A"));
		System.out.println(encoder.encode("B12*Thanks#"));
		System.out.println(encoder.encode("V1@2*Abc*"));
		System.out.println(encoder.encode("s1@ab^college#"));
		System.out.println(encoder.encode("a*B@Good1school"));
	}
}

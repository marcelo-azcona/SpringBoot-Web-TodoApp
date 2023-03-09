package com.marceloazcona.springbootwebtodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUsername = username.equalsIgnoreCase("marcelo");
		boolean isValidPassword = password.equalsIgnoreCase("marcelo");

		return isValidPassword && isValidUsername;
	}
}

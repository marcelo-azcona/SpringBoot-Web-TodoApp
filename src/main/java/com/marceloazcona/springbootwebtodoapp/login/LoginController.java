package com.marceloazcona.springbootwebtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService autheticationService;

	public LoginController(AuthenticationService autheticationService) {
		this.autheticationService = autheticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (autheticationService.authenticate(name, password)) {
			model.put("name", name);
			model.put("password", password);

			return "welcome";
		} else {
			model.put("errorMessage", "Invalid credentials");

			return "login";
		}

	}
}

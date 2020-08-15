package com.cct.garageger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	//Return the page login
	@RequestMapping("login")
	public String login() {
		return "login";
	}

}

package com.cct.garageger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Return the page Home
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

}

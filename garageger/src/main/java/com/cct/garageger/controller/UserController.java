package com.cct.garageger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cct.garageger.model.User;
import com.cct.garageger.repository.UserRepository;

@Controller
@RequestMapping("register")
public class UserController {
	
	@Autowired
	private UserRepository users;
	
	//Return the page Register user
	@RequestMapping
	public String register() {
		return "register";
	}
	
	//Insert the data from the form into the database
	@RequestMapping(method = RequestMethod.POST)
	public String insertData(User user) {
		
		user.setRole("user");
	
		users.save(user);		
		return "register";
	}

}

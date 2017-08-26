package com.bishal.lmscrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bishal.lmscrud.Service.UserService;

import com.bishal.lmscrud.model.User;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/CreateUser",method = RequestMethod.GET)
	public String getSignupForm(@ModelAttribute User user) {
		return "UserCreate";
		
	}
	@RequestMapping(value="/Signup" ,method = RequestMethod.POST)
	public String signupuser(@ModelAttribute User user) {
		
		if(user!=null) {
			userService.saveUserInfo(user);	
		}
		
		return "redirect:/userlogin";
		
	}
	@RequestMapping(value="/userlogin",method = RequestMethod.GET)
	public String getLoginForm(@ModelAttribute User user) {
		return "UserLogin";
		
	}
	@RequestMapping(value="/userlogin" ,method = RequestMethod.POST)
	public String loginUser(@ModelAttribute User user) {
		
		if(user!=null) {
			userService.getUserByunameAndpass(user.getUname(), user.getPassword());
		}
		
		return "redirect:/bookList";
		
	}

}

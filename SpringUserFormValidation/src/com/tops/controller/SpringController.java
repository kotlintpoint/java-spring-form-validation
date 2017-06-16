package com.tops.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String showValidatinForm(Map<String,User> model) {
		User user = new User();
		
		model.put("userform", user);
		
		return "UserForm";
	}
	
	@RequestMapping(value="/user",method = RequestMethod.POST)
	public String postUserForm(@Valid @ModelAttribute("userform") User user,
			BindingResult result, Map<String,User> model) {
		if (result.hasErrors()) {
			return "UserForm";
		}
		// Add the saved validationForm to the model
		model.put("userForm", user);
		return "registrationSuccess";
	}
	
}

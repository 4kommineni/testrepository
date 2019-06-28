package com.spring.hibernatestest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.hibernatestest.service.RegService;
import com.spring.hibernatestest.viewModel.Login;
import com.spring.hibernatestest.viewModel.Registration;

@Controller
@SessionAttributes({"reg","login"})
public class RegistrationController {

	@Autowired
	RegService regService;

	@RequestMapping("/reg")
	public String openReg(Model model) {
		model.addAttribute("reg", new Registration());
		return "registration";
	}
	
	@RequestMapping(value="/regSubmit",method=RequestMethod.POST)
	public String regSubmitted(@Valid @ModelAttribute("reg")Registration reg, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "registration";
		}
		
		regService.addNewUser(reg);
		model.addAttribute("login", new Login(reg.getEmail(), ""));
		
		return "login";
	}	
}

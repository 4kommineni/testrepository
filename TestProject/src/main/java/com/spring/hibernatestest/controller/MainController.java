package com.spring.hibernatestest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.hibernatestest.viewModel.Login;

@Controller
@SessionAttributes({"username"})
public class MainController {
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String forLogout(SessionStatus sessionstatus, Model model) {
		sessionstatus.isComplete();		
		model.addAttribute("login", new Login());
		return "login";
	}
}

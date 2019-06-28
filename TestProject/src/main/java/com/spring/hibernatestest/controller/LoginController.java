package com.spring.hibernatestest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.hibernatestest.model.Students;
import com.spring.hibernatestest.service.LoginService;
import com.spring.hibernatestest.service.MainService;
import com.spring.hibernatestest.viewModel.Login;

@Controller
@SessionAttributes({ "login", "allStudents", "username" })
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	MainService mainService;

	@RequestMapping("/login")
	public String openLogin(@Value("#{session.getAttribute('username')}") String username, Model model) {
		if (username != null) {
			return "main";
		} else {
			model.addAttribute("login", new Login());
			return "login";
		}
	}

	
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmitted(@Valid @ModelAttribute("login") Login login, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "login";
		}	
				
		if (loginService.verifyUser(login)) {
			List<Students> allStudents = mainService.getAllStudents();
			model.addAttribute("username", login.getEmail()); 
			model.addAttribute("allStudents", allStudents);
			return "main";
		} else {
			model.addAttribute("loginError", "Invalid Credentials");
			return "login";
		}
	}
}

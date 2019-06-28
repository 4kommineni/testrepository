package com.spring.hibernatestest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"username"})
public class HomeController {

	@RequestMapping(value = { "/", "/home" })
	public String home(@Value("#{session.getAttribute('username')}") String username, Model model) {
		if (username != null) {
			// hello world
			return "main";
		} else {
			return "home";
		}
	}
}

package com.cts.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	/**
	 * Method receives request for users and redirects to users.jsp
	 */
	@RequestMapping("/index")
	public String Home() {
		
		return "index";
	}
	
	
	@RequestMapping("/user")
	public String showformUser() {
		
		return "user";
	}
	@RequestMapping("/logout")
	public String logoutUser() {
		
		return "logout";
	}
	@RequestMapping("/bmi")
	public String Bmi() {
		return "bmi";
	}

}


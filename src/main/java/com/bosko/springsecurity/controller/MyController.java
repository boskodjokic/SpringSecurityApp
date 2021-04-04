package com.bosko.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
    public String showLanding() {
        return "landing-page";
    }
	
	@GetMapping("/employees")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/managers")
	public String showManagers() {
		return "manager-page";
	}
	
	@GetMapping("/admins")
	public String showAdmins() {
		return "admin-page";
	}

}

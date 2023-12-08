package com.nidheeshnelson.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nidheeshnelson.registration.model.Registration;

@Controller
public class main {
	@RequestMapping("/")
	String first() 
	{
		return "register";
	}

}

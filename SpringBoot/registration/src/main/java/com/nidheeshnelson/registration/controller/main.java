package com.nidheeshnelson.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nidheeshnelson.registration.model.model;

@Controller
public class main {
	@RequestMapping("/")
	String first() {
		return "register";
		
	}
@PostMapping("/reg")
String reg(@RequestParam("name") String n, @RequestParam("place") String p) {
	
	model m = new model();
	m.setName(n);
	m.setPlace(p);
	return "posting";
	}
}

package com.gayathri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mainc {
	@GetMapping("/")
	public String view()
	{
		return "begin";
	}

}

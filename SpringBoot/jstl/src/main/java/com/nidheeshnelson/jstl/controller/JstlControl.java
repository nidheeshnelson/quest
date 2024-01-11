package com.nidheeshnelson.jstl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JstlControl {
@GetMapping("/")
public String view() {
	return "new";
}
}

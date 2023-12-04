package com.SpringbootTestingForJSP2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
@RequestMapping("/")
String my() {
	return "for";
}
}

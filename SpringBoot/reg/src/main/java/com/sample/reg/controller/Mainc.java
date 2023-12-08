package com.sample.reg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mainc 
{
@RequestMapping("/")
String getView()
{
	System.out.println("joi");
	return "index";
}
}

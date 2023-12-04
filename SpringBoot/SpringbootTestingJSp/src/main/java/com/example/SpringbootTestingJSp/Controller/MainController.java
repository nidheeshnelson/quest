package com.example.SpringbootTestingJSp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{

	@RequestMapping("/")
	String view()
	{
		System.out.println("jhfbshgs");
		return "hello";
	}
	
	
}

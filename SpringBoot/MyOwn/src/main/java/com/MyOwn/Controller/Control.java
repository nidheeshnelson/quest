package com.MyOwn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyOwn.Model.Model;

@RestController
public class Control {
	 @GetMapping("/c") 
String own()
{
	return "Nidheesh Nelson";
}
	 @PostMapping("/v")
	 void in(@RequestBody Model m)
	 {
		 System.out.println(m.getId());
		 System.out.println(m.getName());
		 System.out.println(m.getAge());
	 }
}
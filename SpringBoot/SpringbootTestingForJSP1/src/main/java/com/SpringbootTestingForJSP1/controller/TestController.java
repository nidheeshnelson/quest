package com.SpringbootTestingForJSP1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringbootTestingForJSP1.model.ModelFor;

@Controller
public class TestController {
@RequestMapping("/")
String my(Model l, Model m) {
	l.addAttribute("user", "nnn");
	l.addAttribute("mymark",50);
	m.addAttribute("me","Yes I Am");
	return "nn";
}


@GetMapping("/getData")
void display(@RequestParam("b") String t, String y)
{
	System.out.println(t);
}
@GetMapping("/gett")
void displa(@RequestParam List<String> l)
{
	System.out.println(l.get(0)+l.get(1)+l.get(2));
}
void displ(@RequestParam("n") String t)
{
	System.out.println(t);
}
@GetMapping("/get")
void fo(@RequestBody() ModelFor d) {
	System.out.println(d.getB()+d.getM()+d.getN());
}
}
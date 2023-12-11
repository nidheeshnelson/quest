package com.nidheeshnelson.sbtest02.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.nidheeshnelson.sbtest02.model.Login;

@Controller
public class tocontrol {
	@GetMapping("/")
	String getting(Model m) {
		m.addAttribute("info", new Login());
		System.out.println("hello");
		return "my";
	}
	@GetMapping("/login")
	String in(@ModelAttribute("info") Login l, Model m) {
		m.addAttribute("pass", l.getPass());
		m.addAttribute("name", l.getUser());
		m.addAttribute("log",l);
		System.out.println("in");
		return "show";
	}
	@GetMapping("/come/{pass}")
	String prof(@PathVariable("pass") String s, Model m) {
		System.out.println(s);
		m.addAttribute("pass", s);
		return "profile";
	}

}

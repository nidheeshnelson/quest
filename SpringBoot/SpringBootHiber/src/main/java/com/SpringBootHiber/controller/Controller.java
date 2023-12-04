package com.SpringBootHiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootHiber.model.Marks;
import com.SpringBootHiber.model.Student;
import com.SpringBootHiber.repository.MarkRepo;
import com.SpringBootHiber.repository.StudentRepo;

@RestController
public class Controller {
	@Autowired
	private StudentRepo srp;
	@Autowired
	private MarkRepo mr;
	
	@GetMapping("/ad")
	String add(@RequestBody Student s) {
		srp.save(s);
		System.out.println(s.getName());
		return "Success";
	}
	@PostMapping("/ma")
	String marks(@RequestBody Marks m) {
		mr.save(m);
		System.out.println(m.getPhy());
return "marks added";
	}

}

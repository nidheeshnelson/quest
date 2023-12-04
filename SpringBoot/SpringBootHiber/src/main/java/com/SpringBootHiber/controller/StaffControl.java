package com.SpringBootHiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootHiber.model.Staff;
import com.SpringBootHiber.repository.StaffRepo;

@RestController
public class StaffControl {
	@Autowired
	private StaffRepo strp;
@GetMapping("/tea")
public String teach(@RequestBody Staff s) {
	System.out.println(s.getName());
	strp.save(s);
	return "Staff entered";
}
}

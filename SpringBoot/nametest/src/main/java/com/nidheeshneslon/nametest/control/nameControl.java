package com.nidheeshneslon.nametest.control;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nidheeshneslon.nametest.model.nameModel;
import com.nidheeshneslon.nametest.service.nameService;

@Controller
@CrossOrigin
public class nameControl {
	@Autowired
	private nameService ns;
@PostMapping("/ad")
public Map<String, Integer> add (@RequestBody nameModel nm){
	System.out.println("in adding");
	Map<String, Integer> m = new HashMap<>();
	System.out.println(nm);
	boolean r= ns.add(nm);
	if(r) {
	m.put("Succesfully registered", 202);}
	else {
		m.put("Failed", 202);
	}
	return m;
}
//	@GetMapping("/add")
//	public String add (@RequestBody nameModel nm) {
//		System.out.println("in adding"+nm);
//		return "hello";
//	}
}

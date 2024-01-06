package com.nidheeshnelson.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.crud.model.CrudModel;
import com.nidheeshnelson.crud.service.CrudService;

@RestController
@CrossOrigin
public class CrudControl {
	@Autowired
private CrudService cs;
	@PostMapping("/add")
	public Map<String, Integer> add(@RequestBody CrudModel cm) {
		boolean b;
		Map<String, Integer> m=new HashMap<>();
		b=cs.add(cm);
		System.out.println("registered.."+b);
		if(b==true) {
			m.put("Success",202);
		return m;}
		else {
			m.put("Failed",202);
			return m;
		}
	}
	@GetMapping("/view")
	public List<CrudModel> view() {
		List<CrudModel> l = new ArrayList<>();
		l=cs.view();
		System.out.println(l);
		return l;
	}
	@PostMapping("delete")
	public Map<String, Integer> dlt(@RequestBody CrudModel m){
		boolean b;
		Map<String, Integer> mp=new HashMap<>();
		b=cs.delete(m);
		if(b==true) {
			mp.put("Success",202);
		return mp;}
		else {
			mp.put("Failed",202);
		return mp;}
	}
	@GetMapping("/test")
	public String tst() {
		
		return "Nidheesh Nelson";
	}
}

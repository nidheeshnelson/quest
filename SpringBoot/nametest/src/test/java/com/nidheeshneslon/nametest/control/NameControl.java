package com.nidheeshneslon.nametest.control;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nidheeshneslon.nametest.model.NameModel;
import com.nidheeshneslon.nametest.service.NameService;

@Controller
public class NameControl {
	@Autowired
	private NameService ns;
	private Map<String,Integer> m=new HashMap<>();
@GetMapping("/ad")
public Map add(@RequestBody NameModel nm) {
	String s = ns.add(nm);
	if(!s.isEmpty()) {
	m.put("Success fully added", 202);}
	else {
		m.put("Failed", 202);
	}
	return m;
}

}

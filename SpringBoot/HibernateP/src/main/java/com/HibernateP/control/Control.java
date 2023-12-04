package com.HibernateP.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HibernateP.model.Employees;
import com.HibernateP.service.EmpService;

@RestController
public class Control {
	@Autowired
	private EmpService es;
@GetMapping("/in")
String getIn(@RequestBody Employees e) {
	es.input(e);
	return "Add successfully";
}
@PostMapping("/out")
List<Employees> output()
{
	return es.output();
	}
@PostMapping("/view")
Employees view()
{
	return es.view();
}

}

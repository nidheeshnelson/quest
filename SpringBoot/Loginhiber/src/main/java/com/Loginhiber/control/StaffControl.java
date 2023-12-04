package com.Loginhiber.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Loginhiber.model.Login;
import com.Loginhiber.model.Staff;
import com.Loginhiber.service.StaffService;
@RestController
public class StaffControl {
@Autowired
private StaffService ss;
@GetMapping("/in")
String input(@RequestBody Staff s) {
	ss.input(s);
	return "Successfully entered";
}
@GetMapping("/out")
List<Staff> output()
{
	return ss.output();
}
@GetMapping("/get")
int getout(@RequestBody Login l) {
	int a = 0;
	Staff s = ss.getout(l);
	if(s!=null)
	{
		return s.getId();
	}
	else {
		return a;
	}
}
@GetMapping("/up")
Staff update(@RequestBody Staff s) {
	Staff st = ss.update(s);
			return st;
}
@GetMapping("/del")
List<Staff> delete(@RequestBody Staff s){
	List<Staff> ls = ss.delete(s);
	return ls;
}
@RequestMapping("/jsp")
public String home() {
	return "My";
}
}

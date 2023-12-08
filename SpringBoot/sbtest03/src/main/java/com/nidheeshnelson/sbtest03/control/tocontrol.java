package com.nidheeshnelson.sbtest03.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tocontrol {
@GetMapping("/")
String go() {
	return "new";
	
}
}

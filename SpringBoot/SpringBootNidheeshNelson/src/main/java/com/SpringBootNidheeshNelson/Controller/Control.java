package com.SpringBootNidheeshNelson.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
@PostMapping("/no")
String view() {
	return "nothing";
}
}

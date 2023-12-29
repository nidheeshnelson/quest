package com.crud.todo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.todo.model.ListModel;
import com.crud.todo.service.ListService;

@Controller
public class ListControl {
	@Autowired
	private ListService ls;
@GetMapping("/add")
public ListModel add(@RequestBody ListModel lm) {
	System.out.println("In add");
	ListModel lmm= new ListModel();
	lmm= ls.Add(lm);
	System.out.println(lmm);
	return lmm;
}

}

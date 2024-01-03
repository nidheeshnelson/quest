package com.crud.todo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.todo.model.ListModel;
import com.crud.todo.service.ListService;

@RestController
public class ListControl {
	@Autowired
	private ListService ls;
@GetMapping("/add")
public List<ListModel> add(@RequestBody ListModel lm) {
	System.out.println("In add");
//	ListModel lmm= new ListModel();
	List<ListModel> lmm;
	if(lm.getId().isEmpty()) {
	lmm= ls.Add(lm);}
	else {
		lmm= ls.update(lm);
	}
	System.out.println(lmm);
	return lmm;
}
@PostMapping("/del")
public void delete(@RequestBody ListModel lm) {
	System.out.println("in  "
			+ "delete");
	ls.delete(lm);
}
@GetMapping("/sh")
public List<ListModel> Show() {
	System.out.println("In  show");

return ls.show();
}
}

package com.crud.todo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.todo.model.IdModel;
import com.crud.todo.model.ListModel;
import com.crud.todo.repositary.IdRepo;
import com.crud.todo.repositary.ListRepo;

@Service
public class ListService {
	private final String task="TASK";
	private String id;
	@Autowired
private ListRepo lr;
	@Autowired
private IdRepo ir;
	public ListModel Add(ListModel lm) {
		IdModel idm=new IdModel();
		System.out.println("In service add");
		lm.setDateandtime(LocalDateTime.now().toString());
		System.out.println(lm.getDateandtime());
		id = task.concat(ir.save(idm).toString());
		System.out.println(id);
		lm.setId(id);
		ListModel lmm = lr.save(lm);
		System.out.println(lmm+"hi");
		return lmm;
	}
}

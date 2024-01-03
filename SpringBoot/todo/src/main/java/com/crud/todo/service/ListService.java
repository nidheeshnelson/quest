package com.crud.todo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

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
	public List<ListModel> Add(ListModel lm) {
		IdModel idm=new IdModel();
		System.out.println("In service add");
		
		lm.setDate(LocalDate.now().toString());
		lm.setTime(LocalTime.now().toString());
		System.out.println(lm.getDateandtime()+"hloo"+lm.getDate()+"hiii"+lm.getTime());
		id = task.concat(ir.save(idm).toString());
		System.out.println(id);
		lm.setId(id);
		List<ListModel> lmm = null;
		try {
			System.out.println("In try");
			ListModel im = lr.save(lm);
			System.out.println(im);
		 lmm= lr.findAll();
		System.out.println(lmm+"hi");}
		catch(Exception e) {
			System.out.println(e);
		}
		return lmm;
	}
	public List<ListModel> update(ListModel lm) {
		System.out.println("In service add");
		lm.setDateandtime(LocalDateTime.now().toString());
		lm.setDate(LocalDate.now().toString());
		lm.setTime(LocalTime.now().toString());
		System.out.println(lm.getDateandtime());
		List<ListModel> lmm = null;
		try {
		ListModel im = lr.save(lm);
		lmm = lr.findAll();
		System.out.println(lmm+"hi");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return lmm;
	}
	public void delete(ListModel lm) {
		System.out.println("In service delete");
		lr.delete(lm);
	}
	public List<ListModel> show() {
	return lr.findAll();
	}
}

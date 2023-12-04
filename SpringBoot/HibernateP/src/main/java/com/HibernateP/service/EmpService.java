package com.HibernateP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HibernateP.model.Employees;
import com.HibernateP.repository.EmpRepo;
@Service
public class EmpService {
	@Autowired
    private EmpRepo er;
	public void input(Employees e) {
		er.save(e);
	}
	public List<Employees> output(){
//		List<Employees> e = er.findAll();
		return er.findAll();
	}
	public Employees view()
	{
		int id =1;
		return er.findById(id);
	}
}

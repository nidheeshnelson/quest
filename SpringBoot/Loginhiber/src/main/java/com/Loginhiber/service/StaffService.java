package com.Loginhiber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Loginhiber.model.Login;
import com.Loginhiber.model.Staff;
import com.Loginhiber.repositary.StaffRepo;

@Service
public class StaffService {
@Autowired
private StaffRepo sr;
public void input(Staff s) {
	sr.save(s);
}
public List<Staff> output(){
	return sr.findAll();
}
public Staff getout(Login l) {
	
	Staff s=sr.findByUser(l.getUser());
			if(s.getPassword().equals(l.getPassword())) 
			{
				return s;
			}
			else {
				return s=null;
			}
}
public Staff update(Staff s) {
	Staff st=sr.findById(s.getId());
	try {
		
		if(s.getName().isEmpty()==false) {
			st.setName(s.getName());
		}
		if(s.getAge()!=0) {
			st.setAge(s.getAge());
		}
		if(s.getPlace().isEmpty()==false) {
			st.setPlace(s.getPlace());
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	sr.save(st);
	s=sr.findById(s.getId());
	return s;
}
public List<Staff> delete (Staff s){
	sr.delete(s);
	return sr.findAll();
}
}

package com.nidheeshnelson.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.crud.model.CrudModel;
import com.nidheeshnelson.crud.repositary.CrudRepo;

@Service
public class CrudService {
	@Autowired
private CrudRepo cr;
	public boolean add(CrudModel cm) {
		CrudModel cdm = new CrudModel();
		cdm=cr.save(cm);
		if(cdm.getName().isEmpty()) {
		return false;}
		else {
			return true;
		}
	}
	public List<CrudModel> view() {
		List<CrudModel> l = new ArrayList<>();
		l=cr.findAll();
		return l;
	}
	public boolean delete(CrudModel cm) {
		CrudModel cdm = new CrudModel();
		cr.delete(cm);
		return true;
	}
}

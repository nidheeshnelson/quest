package com.nidheeshneslon.nametest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshneslon.nametest.model.nameModel;
import com.nidheeshneslon.nametest.repositary.nameRepo;

@Service
public class nameService {
	@Autowired
private nameRepo nr;
	public boolean add(nameModel m) {
		System.out.println("in service add");
		nr.save(m);
		return true;
	}
}

package com.nidheeshneslon.nametest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshneslon.nametest.model.NameModel;
import com.nidheeshneslon.nametest.repositary.NameRepo;
@Service
public class NameService {
	@Autowired
private NameRepo nr;
	public String add(NameModel nm) {
		String s = null;
		s=nr.save(nm).toString();
		return s;
	}
}

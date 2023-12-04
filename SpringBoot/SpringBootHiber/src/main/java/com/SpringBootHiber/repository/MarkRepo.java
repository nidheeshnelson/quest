package com.SpringBootHiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootHiber.model.Marks;


	@Repository
	public interface MarkRepo extends JpaRepository<Marks, Integer>{
		
	}


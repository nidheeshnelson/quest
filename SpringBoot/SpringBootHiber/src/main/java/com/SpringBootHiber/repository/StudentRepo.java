package com.SpringBootHiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootHiber.model.Marks;
import com.SpringBootHiber.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}

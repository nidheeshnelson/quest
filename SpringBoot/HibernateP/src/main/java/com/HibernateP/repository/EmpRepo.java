package com.HibernateP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernateP.model.Employees;

@Repository
public interface EmpRepo extends JpaRepository<Employees, Integer> {
 public Employees findById(int e);
}

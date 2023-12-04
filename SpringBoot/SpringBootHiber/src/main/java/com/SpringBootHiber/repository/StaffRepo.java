package com.SpringBootHiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootHiber.model.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}

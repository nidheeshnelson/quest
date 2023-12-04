package com.Loginhiber.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loginhiber.model.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{
public Staff findByUser(String a);
public Staff findById(int b);
}

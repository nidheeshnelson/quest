package com.NiB_Link.MainProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NiB_Link.MainProject.model.Expert;

@Repository
public interface ExpertRepo extends JpaRepository<Expert, Integer> {

}

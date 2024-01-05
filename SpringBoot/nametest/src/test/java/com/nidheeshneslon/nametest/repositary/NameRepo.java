package com.nidheeshneslon.nametest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshneslon.nametest.model.NameModel;

@Repository
public interface NameRepo extends JpaRepository<NameModel, Integer> {

}

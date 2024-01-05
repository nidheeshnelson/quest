package com.nidheeshneslon.nametest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshneslon.nametest.model.nameModel;

@Repository
public interface nameRepo extends JpaRepository<nameModel, Integer>{

}

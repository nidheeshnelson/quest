package com.nidheeshnelson.crud.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.crud.model.CrudModel;

@Repository
public interface CrudRepo extends JpaRepository<CrudModel, Integer>{

}

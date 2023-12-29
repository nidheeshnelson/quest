package com.crud.todo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.todo.model.IdModel;
@Repository
public interface IdRepo extends JpaRepository<IdModel, Integer>{

}

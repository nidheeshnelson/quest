package com.crud.todo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.todo.model.ListModel;
@Repository
public interface ListRepo extends JpaRepository<ListModel, String>{

}

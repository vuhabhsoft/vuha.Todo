package com.vu.project.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vu.project.model.ToDoWork;


@Repository
public interface ToDoRepository extends CrudRepository<ToDoWork, Integer> {

}

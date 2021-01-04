package com.vu.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vu.project.model.ToDoWork;


@Repository
public interface ToDoRepository extends JpaRepository<ToDoWork, Long> {

}

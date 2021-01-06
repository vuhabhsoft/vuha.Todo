package com.vu.project.service;

import java.util.List;


import com.vu.project.model.ToDoWork;

public interface ToDoService{
    List<ToDoWork> findAllTodo();

    ToDoWork getTodoById(Integer id);

    void save(ToDoWork todo);

    void remove(ToDoWork todo);

    void deleteById(int id);
}

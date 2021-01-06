package com.vu.project.service;

import java.util.List;
import java.util.Optional;

import com.vu.project.model.ToDoWork;
import com.vu.project.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImp implements ToDoService {

    @Autowired
    private ToDoRepository todoRepository;

    @Override
    public List<ToDoWork> findAllTodo() {
        
        return (List<ToDoWork>) todoRepository.findAll();
    }

    @Override
    public ToDoWork getTodoById(Integer id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public void save(ToDoWork todo) {
        todoRepository.save(todo);
    }

    @Override
    public void remove(ToDoWork todo) {
        todoRepository.delete(todo);
    }

    @Override
    public void deleteById(int id) {
        todoRepository.deleteById(id);
    }
    
}

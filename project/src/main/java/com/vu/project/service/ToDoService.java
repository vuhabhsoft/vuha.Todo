package com.vu.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vu.project.model.ToDoWork;
import com.vu.project.repository.ToDoRepository;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository todoRepository;

    public List<ToDoWork> findAll() {
        return todoRepository.findAll();
    }

    
    public ToDoWork add(ToDoWork todo) {
        
            return todoRepository.save(todo);    
    }

    public void remove(ToDoWork todo){
        todoRepository.delete(todo);
    }

    
    public Optional<ToDoWork> findById(Long id) {
        return todoRepository.findById(id);
    }
}

package com.vu.project.controller;



import com.vu.project.model.ToDoWork;
import com.vu.project.service.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ToDoController {
    @Autowired
    private ToDoService todoService;

    @GetMapping("/listTodo")
    public String findAll(Model model) {
        model.addAttribute("todoList", todoService.findAllTodo());
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new ToDoWork());
        return "addTodo";
    }

    
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute ToDoWork todo) {
        todoService.save(todo);
        return "success";
    }

    @GetMapping("/delTodo")
    public String delTodo(Model model) {
        model.addAttribute("todo", new ToDoWork());
        return "delToDo";
     }

    @RequestMapping("/todo/delete/{id}")
    public String delete(@PathVariable Integer id) {
        todoService.deleteById(id);
        return "redirect:/listTodo";
    }
    @RequestMapping("/todo/edit/{id}")
    public String edit(Model model ,@PathVariable Integer id) {
        model.addAttribute("todo", todoService.getTodoById(id));
        return "addTodo";
    }
    @RequestMapping("/todo/detail/{id}")
    public String detail(Model model ,@PathVariable Integer id) {

        model.addAttribute("todo", todoService.getTodoById(id));
        return "ToDoShow";
    }
}

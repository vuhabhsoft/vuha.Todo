package com.vu.project.controller;



import com.vu.project.model.ToDoWork;
import com.vu.project.service.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ToDoController {
    @Autowired
    private ToDoService todoService;

    @GetMapping("/listTodo")
    public String findAll(Model model) {
        model.addAttribute("todoList", todoService.findAll());
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new ToDoWork());
        return "addTodo";
    }

     /*
    @ModelAttribute đánh dấu đối tượng Todo được gửi lên bởi Form Request
     */
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute ToDoWork todo) {
        todoService.add(todo);
        return "success";
    }

    // @GetMapping("/delTodo")
    // public String delTodo(ToDoWork todo) {        
    //     return "delToDo";
    // }

    // @RequestMapping(value = "/delTodo/{id}", method = RequestMethod.DELETE)
    // public String delTodo(@PathVariable("id") Long id){
    //     Optional<ToDoWork> todo = todoService.findById(id);
    //     todoService.remove(todo.get());
    //     return "delsuccess";
    // }
    // //  @RequestMapping(value = "/products/{id}/delete", method = RequestMethod.DELETE)
    // // public ResponseEntity<Product> deleteProduct(@PathVariable("id") Integer id) {
    // //     Optional<Product> product = productService.findById(id);
    // //     if (!product.isPresent()) {
    // //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // //     }
    // //     productService.remove(product.get());
    // //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // // }
}

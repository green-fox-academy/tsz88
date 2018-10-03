package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.ToDoService;
import com.greenfoxacademy.todomysql.models.ToDo;
import com.greenfoxacademy.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;
  @Autowired
  ToDoService toDoService;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model){
    model.addAttribute("todolist",toDoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String listOnlyActive(@RequestParam(value = "isActive", required = false) boolean isActive, Model model){
    if(isActive){
    model.addAttribute("todolist",toDoService.activeTodos());}
    else{
      model.addAttribute("todolist",toDoRepository.findAll());
    }
    return "todolist";
  }

  @GetMapping("/addtodo")
  public String addToDoPageDisplay(Model model){
    model.addAttribute("newTodo", new ToDo());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String addToDoToTheList(@ModelAttribute ToDo newTodo, Model model){
    if (newTodo == null){
      model.addAttribute("errormessage", "Empty content cannot be added to ToDoList.");
      return "addtodo";
    }

    toDoRepository.save(newTodo);
    return "redirect:/";
  }
}

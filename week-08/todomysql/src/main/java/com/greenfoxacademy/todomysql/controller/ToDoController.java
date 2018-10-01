package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.ToDoService;
import com.greenfoxacademy.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}

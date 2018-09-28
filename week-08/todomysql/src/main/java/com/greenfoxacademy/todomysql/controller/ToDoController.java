package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model){
    model.addAttribute("todolist",toDoRepository.findAll());
    return "todolist";
  }
}

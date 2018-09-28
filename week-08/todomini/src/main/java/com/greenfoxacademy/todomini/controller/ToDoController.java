package com.greenfoxacademy.todomini.controller;

import com.greenfoxacademy.todomini.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model){
    return "todolist";
  }
}

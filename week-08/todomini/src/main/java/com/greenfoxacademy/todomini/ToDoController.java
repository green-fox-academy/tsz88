package com.greenfoxacademy.todomini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @RequestMapping(value={"/", "/list"})
  public String list(Model model){
    return "This is my first todo";
  }
}

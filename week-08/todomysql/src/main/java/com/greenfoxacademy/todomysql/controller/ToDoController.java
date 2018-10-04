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

  String generalMessageOnMainPage;

  @GetMapping("")
  public String listOnlyActive(@RequestParam(value = "isActive", required = false) boolean isActive, Model model){
    if(isActive){
    model.addAttribute("todolist",toDoService.activeTodos());}
    else{
      model.addAttribute("todolist",toDoRepository.findAll());
    }
    model.addAttribute("generalmessage", generalMessageOnMainPage);
    return "todolist";
  }

  @GetMapping("/addtodo")
  public String addToDoPageDisplay(Model model){
    model.addAttribute("newTodo", new ToDo());
    model.addAttribute("errormessage", "\n");
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String addToDoToTheList(@ModelAttribute ToDo newTodo, Model model){
    if (newTodo.getTitle().isEmpty()){
      model.addAttribute("errormessage", "Empty content cannot be added to ToDoList.");
      model.addAttribute("newTodo", newTodo);
      return "addtodo";
    }

    toDoRepository.save(newTodo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") Long id){
    generalMessageOnMainPage = toDoRepository.findById(id).get().getTitle() + " successfully deleted.";
    toDoRepository.deleteById(id);
    return  "redirect:/todo";
  }
}

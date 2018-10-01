package com.greenfoxacademy.todomysql;

import com.greenfoxacademy.todomysql.models.ToDo;
import com.greenfoxacademy.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
  private ToDoRepository toDoRepository;

  @Autowired
  public ToDoService(ToDoRepository toDoRepository){
    this.toDoRepository = toDoRepository;
  }

  public List<ToDo> activeTodos(){
    List<ToDo> actives = new ArrayList<>();
    for (ToDo todo:
         toDoRepository.findAll()) {
      if (!todo.getDone()) {
        actives.add(todo);
      }
    }
    return actives;
  }
}

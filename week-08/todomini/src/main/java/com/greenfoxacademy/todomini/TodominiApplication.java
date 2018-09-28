package com.greenfoxacademy.todomini;

import com.greenfoxacademy.todomini.model.ToDo;
import com.greenfoxacademy.todomini.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodominiApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;
  public static void main(String[] args) {
    SpringApplication.run(TodominiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("I have to learn  Object Relational Mapping."));
  }
}

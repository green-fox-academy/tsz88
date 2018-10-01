package com.greenfoxacademy.todomysql;

import com.greenfoxacademy.todomysql.models.ToDo;
import com.greenfoxacademy.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    }
}

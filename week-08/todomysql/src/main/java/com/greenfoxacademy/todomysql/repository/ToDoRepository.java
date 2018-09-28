package com.greenfoxacademy.todomysql.repository;


import com.greenfoxacademy.todomysql.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
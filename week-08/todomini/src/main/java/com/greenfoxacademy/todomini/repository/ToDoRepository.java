package com.greenfoxacademy.todomini.repository;

import com.greenfoxacademy.todomini.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}

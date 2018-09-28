package com.greenfoxacademy.todomini.model;

import javax.persistence.*;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  long id;
  String title;
  boolean urgent;
  boolean done;

  public ToDo(String title){
    this.title = title;
  }
}

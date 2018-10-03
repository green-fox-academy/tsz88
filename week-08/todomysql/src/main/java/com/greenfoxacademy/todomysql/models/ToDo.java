package com.greenfoxacademy.todomysql.models;

import javax.persistence.*;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  long id;

  private String title;
  private boolean urgent;
  private boolean done;

  public ToDo() {
  }

  public ToDo(String title) {
    this.title = title;
  }

  public ToDo(String title, boolean urgency, boolean status) {
    this.title = title;
    urgent = urgency;
    done = status;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean getUrgent() {
    return urgent;
  }

  public boolean getDone() {
    return done;
  }


}
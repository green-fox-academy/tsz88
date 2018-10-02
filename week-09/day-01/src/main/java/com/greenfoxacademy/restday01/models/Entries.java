package com.greenfoxacademy.restday01.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Entries {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  long id;

  @Column(name = "created_at")
  Timestamp timestamp;
  @Column (name = "endpoint")
  String endpoint;
  @Column (name = "data")
  String dataInvolvedInMethod;

  public Entries(){}

  public Entries(String endpoint, String data){
    timestamp = new Timestamp(System.currentTimeMillis());
    this.endpoint = endpoint;
    this.dataInvolvedInMethod = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getDataInvolvedInMethod() {
    return dataInvolvedInMethod;
  }

  public void setDataInvolvedInMethod(String dataInvolvedInMethod) {
    this.dataInvolvedInMethod = dataInvolvedInMethod;
  }

}

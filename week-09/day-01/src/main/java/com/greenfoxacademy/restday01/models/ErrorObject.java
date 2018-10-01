package com.greenfoxacademy.restday01.models;

public class ErrorObject {

  String error;

  public ErrorObject(){
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

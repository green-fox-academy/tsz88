package com.greenfoxacademy.groot.models;

public class ErrorMessages {
  private String error;

  public ErrorMessages(){}

  public ErrorMessages(String method){
    if (method.equals("groot")){
      error = "I am Groot!";
    }
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

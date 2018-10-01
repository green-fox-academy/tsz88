package com.greenfoxacademy.restday01.models;

public class ErrorObject {

  String error;

  public ErrorObject(String method) {
    if (method.equals("doubler")) {
      error = "Please provide an input!";
    }
    if (method.equals("greeterNoName")) {
      error = "Please provide a name!";
    }
    if (method.equals("greeterNoTitle")){
      error = "Please provide a title!";
    }

    if (method.equals("dountil")){
      error = "Please provide a number!";
    }
  }

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

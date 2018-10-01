package com.greenfoxacademy.restday01.models;

public class Appender {

  String appended;

  public Appender(){
  }

  public Appender(String word){
    appended = word + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}

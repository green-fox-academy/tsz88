package com.greenfoxacademy.groot.models;

public class GrootDictionary {
  private String received;
  private String translated = "I am Groot!";

  public GrootDictionary(){}

  public GrootDictionary(String received){
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}

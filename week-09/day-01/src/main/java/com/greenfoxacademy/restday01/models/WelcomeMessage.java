package com.greenfoxacademy.restday01.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WelcomeMessage {

  @JsonProperty("welcome_message")
  String welcomeMessage;

  public WelcomeMessage() {
  }

  public WelcomeMessage(String name, String title){
    welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}

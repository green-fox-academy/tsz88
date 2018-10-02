package com.greenfoxacademy.groot.models;

public class NewLoadForSpaceShip {

  String received;
  int amount;


  public NewLoadForSpaceShip() {
  }

  public NewLoadForSpaceShip(String received, int amount) {
    this.setReceived(received);
    this.setAmount(amount);
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

}
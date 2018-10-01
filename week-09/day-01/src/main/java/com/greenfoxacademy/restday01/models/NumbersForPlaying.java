package com.greenfoxacademy.restday01.models;


public class NumbersForPlaying {

  int received;
  int result;

  public NumbersForPlaying(){
  }

  public NumbersForPlaying(Integer received){
    this.received = received;
    this.result = 2 * received;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

package com.greenfoxacademy.restday01.models;

public class NumbersForPlaying {

  Integer received;
  Integer result;

  public NumbersForPlaying(){
  }

  public NumbersForPlaying(int received){
    this.received = received;
    this.result = 2 * received;
  }

}

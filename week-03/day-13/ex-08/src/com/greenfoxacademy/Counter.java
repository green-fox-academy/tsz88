package com.greenfoxacademy;

public class Counter {
  int number;
  int startNumber;

  public Counter(){
    number = 0;
    startNumber = 0;
  }

  public Counter(int startNumber){
    this.number = startNumber;
    this.startNumber = startNumber;
  }

  public int add(int otherNumber){
    number = number + otherNumber;
    return number;
  }

  public int add(){
    number += 1;
    return number;
  }

  public int get(){
    return number;
  }

  public int reset(){
    number = startNumber;
    return number;
  }
  public static void main(String[] args) {
    // write your code here
  }
}

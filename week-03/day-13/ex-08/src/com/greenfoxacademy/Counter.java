package com.greenfoxacademy;

public class Counter {
  int number;

  public Counter(){
    number = 0;
  }

  public Counter(int startNumber){
    this.number = startNumber;
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
    number = 0;
    return number;
  }
  public static void main(String[] args) {
    // write your code here
  }
}

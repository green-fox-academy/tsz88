package com.greenfoxacademy;

public class Counter {
  public static void main(String[] args){
    System.out.println(backCounter(58));
  }

  public static String backCounter(int n){
    if (n == 1){
      return "1";
    } else {
      return n + ", "+backCounter(n-1);
    }
  }
}


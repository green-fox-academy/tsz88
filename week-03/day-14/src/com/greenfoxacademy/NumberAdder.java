package com.greenfoxacademy;

public class NumberAdder {
  public static void main(String[] args){
    System.out.println(adder(12));
  }

  public static int adder(int n){
    if (n == 0){
      return 0;
    } else {
      return n+adder(n-1);
    }
  }
}

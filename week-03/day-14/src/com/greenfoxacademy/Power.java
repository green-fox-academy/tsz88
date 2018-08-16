package com.greenfoxacademy;

public class Power {
  public static void main(String[] args){
    System.out.println(powerN(2,4));
  }

  public static int powerN(int base, int power){
    if (power == 1){
      return base;
    } else {
      return base*powerN(base,power-1);
    }
  }
}

package com.greenfoxacademy;

public class Bunnies {
  public static void main(String[] args){
    System.out.println(bunnyEarCounter(74));
  }


  public static int bunnyEarCounter(int bunny){
    if (bunny == 0){
      return 0;
    } else {
      return bunnyEarCounter(bunny-1) + 2;
    }
  }
}

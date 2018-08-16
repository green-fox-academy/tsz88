package com.greenfoxacademy;

public class BunniesAgain {
  public static void main(String[] args){
    System.out.println(mutantBunnyEarCounter(2));
  }


  public static int mutantBunnyEarCounter (int bunny){
    if (bunny == 0){
      return 0;
    } else {
      double k = (mutantBunnyEarCounter(bunny-1) + 2.5);
      return (int)(k);
    }
  }
}

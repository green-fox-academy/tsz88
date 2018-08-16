package com.greenfoxacademy;

public class BunniesAgain {
  public static void main(String[] args){
    System.out.println(mutantBunnyEarCounterInt(12));
  }


  public static double mutantBunnyEarCounterDouble (int bunny){
    if (bunny == 0){
      return 0;
    } else {
      return mutantBunnyEarCounterDouble(bunny-1) + 2.5;
    }
  }

  public static int mutantBunnyEarCounterInt (int bunny){
    return (int)(mutantBunnyEarCounterDouble(bunny));
  }
}

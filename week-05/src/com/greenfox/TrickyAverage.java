package com.greenfox;

public class TrickyAverage {

  public static void main(String[] args) {
    int[] example = {1, 2, 3, 4, 5, 6, 7, 8};
    getTrickyAvg(example);
  }

  public static double getTrickyAvg(int[] source){
    //average of smallest odd and largest even
    int smallestOdd = 100;
    int largestEven = 0;
    for (int i = 0; i < source.length; i++){
      if (source[i] % 2 == 0){
        if (largestEven < source[i]){
          largestEven = source[i];
        }
      }
      else {
        if (smallestOdd > source[i]){
          smallestOdd = source[i];
        }
      }
    }
    System.out.println(largestEven);
    return (double)(smallestOdd + largestEven) / 2;
  }
}

package com.greenfox;

public class TrickyAverage {

  public static void main(String[] args) {

  }

  public double getTrickyAvg(int[] source){
    //average of smallest odd and largest even
    int smallestOdd = 0;
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
    return (smallestOdd + largestEven) / 2;
  }
}

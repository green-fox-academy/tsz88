package com.greenfox;

import org.omg.CORBA.UserException;

public class TrickyAverage {

  public static void main(String[] args) {
    int[] example = {1, 2, 3, 4, 5, 6, 7, 8};
    getTrickyAvg(example);
  }

  public static double getTrickyAvg(int[] source) {
    //average of smallest odd and largest even
    //this does not work with 0 as largest even number
    int largestEven = 0;
    int smallestOdd = 0;
    for (int i = 0; i < source.length; i++) {
      if (source[i] % 2 == 0) {
        largestEven = source[i];
      } else {
        smallestOdd = source[i];
      }
    }
    for (int j = 0; j < source.length; j++) {
      if (source[j] % 2 == 0) {
        if (source[j] > largestEven) {
          largestEven = source[j];
        }
      } else {
          if (source[j] < smallestOdd)
            smallestOdd = source[j];
        }
      }
    return (double) (smallestOdd + largestEven) / 2;
  }
}
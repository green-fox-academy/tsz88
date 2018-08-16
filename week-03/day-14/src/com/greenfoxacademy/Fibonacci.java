package com.greenfoxacademy;
// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.

public class Fibonacci {
  public static void main(String[] args){
    System.out.println(fibNumbAtIndex(10));
  }

  public static int fibNumbAtIndex(int index){
    if (index <= 1){
      return index;
    } else {
      int k = fibNumbAtIndex(index-1)+fibNumbAtIndex(index-2);
      return k;
    }
  }
}

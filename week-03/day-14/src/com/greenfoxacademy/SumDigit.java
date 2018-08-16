package com.greenfoxacademy;

public class SumDigit {
  public static void main(String[] args){
    System.out.println(digitSummer(123456));
  }


  public static int digitSummer(int n){
    if (n == 0){
      return n;
    } else {
      int k = n % 10;
      n = n / 10;
      return k + digitSummer(k-1);
    }
  }
}
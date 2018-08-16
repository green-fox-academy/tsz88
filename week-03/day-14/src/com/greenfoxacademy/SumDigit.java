package com.greenfoxacademy;

public class SumDigit {
  public static void main(String[] args){
    System.out.println(digitSummer(5252));
  }


  public static int digitSummer(int n){
    if (n == 0){
      return n;
    } else {
      return digitSummer(n/10) + n % 10;
    }
  }
}
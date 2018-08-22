package com.greenfoxacademy;

public class Gnirts implements CharSequence {
  public String whatever;

  public Gnirts(String x){
    whatever = x;
  }

  public int length(){
    return whatever.length();
  }

  public char charAt(int index) {
    return whatever.charAt(index);
  }

  public CharSequence subSequence(int start, int end) {
    return whatever.subSequence(start,end);
  }
}

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
    return whatever.charAt((whatever.length()-1)-index);
  }

  public String subSequence(int start, int end) {
    String y = "";
    for (int i = (whatever.length()-1)-start; i >= (whatever.length()-1)-end; i--){
      y = y + whatever.substring(i, i + 1);
    }
    return y;
  }
}

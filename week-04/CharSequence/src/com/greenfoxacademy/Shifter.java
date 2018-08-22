package com.greenfoxacademy;

public class Shifter implements CharSequence{
  public String text;
  public int shift;

  //constructor
  public Shifter(String y, int shift){
    text = y;
    this.shift = shift;
  }

  public int length() {
    return text.length();
  }

  public char charAt(int index) {
    if (index + shift < text.length()){
      return text.charAt(index+shift);
    } else {
      //subtracts the length until the end of the word from the shift
      return text.charAt(shift - (text.length() - index));
    }
  }

  public String subSequence(int start, int end) {
    if (end + shift < text.length()) {
      return text.substring(start + shift, end + shift);
    } else if (start + shift < text.length() && (end + shift) >= text.length()) {
      return text.substring(start + shift) + text.substring(0, shift - text.length() + end);
    } else {
      return text.substring(shift - text.length() + start , shift - text.length() + end);
    }
  }
}

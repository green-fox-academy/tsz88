package com.greenfoxacademy;
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
  public static void main(String[] args){
    System.out.println(starsInBetween("Nem valami szép."));
  }

  public static String starsInBetween(String input){
    if (input.charAt(input.length()-1) == '*'){
      return input;
    } else {
      return starsInBetween(input.replace("","*"));
    }
  }
}

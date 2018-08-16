package com.greenfoxacademy;
// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
  public static void main(String[] args){
    System.out.println(exRemover("Fox fix turmix rocks."));
  }

  public static String exRemover(String input){
    if (!input.contains("x")){
      return input;
    } else {
      return exRemover(input.replace("x",""));
    }
  }

}

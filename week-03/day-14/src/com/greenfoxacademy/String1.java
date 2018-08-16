package com.greenfoxacademy;
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args){
    System.out.println(exToWhy("Mix turmix hayyayy why whx."));
  }

  public static String exToWhy(String text){
    if (!text.contains("x")){
      return text;
    } else {
      return exToWhy(text.replace("x","y"));
    }
  }
}

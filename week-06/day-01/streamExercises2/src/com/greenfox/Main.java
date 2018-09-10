package com.greenfox;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
      String text = "AztAMinDenIT";
      System.out.println(countUpperCaseLetters(text));
    }

  //exercise5
  //Write a Stream Expression to find the uppercase characters in a string!
  private static int countUpperCaseLetters(String text) {
    return text.chars()
        .mapToObj(letter -> (char) letter)
        .filter(x->Character.isUpperCase(x))
        .collect(Collectors.toList()).size();
  }


}

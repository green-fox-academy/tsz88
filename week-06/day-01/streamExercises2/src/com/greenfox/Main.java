package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    String text = "AztAMinDenIT";
    System.out.println(countUpperCaseLetters(text));

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(startsWithAEndsWithI(cities));
  }

  private static ArrayList<String> startsWithAEndsWithI(ArrayList<String> cities) {
    //this works with capital letter city-names only
    return (ArrayList<String>) cities.stream()
            .filter(city -> city.charAt(0) == 'A')
            .filter(city -> city.charAt(city.length()-1) == 'I')
            .collect(Collectors.toList());
  }


  //exercise5
  //Write a Stream Expression to find the uppercase characters in a string!
  private static int countUpperCaseLetters(String text) {
    return text.chars()
        .mapToObj(letter -> (char) letter)
        .filter(x -> Character.isUpperCase(x))
        .collect(Collectors.toList()).size();
  }
}
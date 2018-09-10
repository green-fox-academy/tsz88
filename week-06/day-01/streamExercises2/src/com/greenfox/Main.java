package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    String text = "NemSemmi";
    System.out.println(countUpperCaseLetters(text));

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(startsWithAEndsWithI(cities));

    System.out.println(frequencyOfLetters(text));

    ArrayList<Integer> numbers8 = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    System.out.println(frequencyOfNumbers(numbers8));
  }

  //exercise 8 number arraylist, what is the frequency of each number
  private static Map<Integer, Long> frequencyOfNumbers(ArrayList<Integer> numbers8) {
    return numbers8.stream()
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
  }

  // exercise 7 unique letters with frequency in given text
  private static Map<Character, Long> frequencyOfLetters(String text) {
    Map<Character, Long> countedLetters =
        text.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                c -> c, Collectors.counting()));
    return countedLetters;
  }


  //exercise 6
  private static ArrayList<String> startsWithAEndsWithI(ArrayList<String> cities) {
    //this works with capital letter city-names only
    return (ArrayList<String>) cities.stream()
        .filter(city -> city.charAt(0) == 'A')
        .filter(city -> city.charAt(city.length() - 1) == 'I')
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
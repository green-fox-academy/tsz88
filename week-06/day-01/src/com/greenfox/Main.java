package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
      ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

      System.out.println(evenNumbers(numbers));

    }
//exercise1
  private static ArrayList<Integer> evenNumbers(ArrayList<Integer> numbers) {
      return (ArrayList<Integer>) numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
  }


}

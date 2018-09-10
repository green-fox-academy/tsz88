package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    // write your code here
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));


    System.out.println(evenNumbers(numbers));
    System.out.println(oddNumbersAverage(numbers));
    System.out.println(squareOfAllPositives(numbers));
    System.out.println(squareIsLargerThan20(numbers2));

  }
  //exercise4
  private static ArrayList<Integer> squareIsLargerThan20(ArrayList<Integer> numbers2) {
    return (ArrayList<Integer>) numbers2.stream()
        .filter(number -> (number * number) > 20)
        .collect(Collectors.toList());
  }

  //exercise3
  private static ArrayList<Integer> squareOfAllPositives(ArrayList<Integer> numbers) {
    return (ArrayList<Integer>) numbers.stream()
        .filter(number -> number > 0)
        .map(number -> number * number)
        .collect(Collectors.toList());
  }

  //exercise2
  private static int oddNumbersAverage(ArrayList<Integer> numbers2) {
    return numbers2.stream()
        .filter(number -> number % 2 != 0)
        .reduce((number1, number2) -> number1 + number2)
        .get();
  }

  //exercise1
  private static ArrayList<Integer> evenNumbers(ArrayList<Integer> numbers) {
    return (ArrayList<Integer>) numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
  }


}

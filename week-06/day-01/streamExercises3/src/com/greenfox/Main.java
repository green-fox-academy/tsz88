package com.greenfox;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    //exercise 9
    // Write a Stream Expression to convert a char array to a string!

    char[] charArray = {'a', 'b', 'c', 'd'};
    System.out.println(charArrayToString(charArray));
  }

  private static String charArrayToString(char[] charArray) {
//    Collector<char[], StringJoiner, String> merger =
//        Collector.of(
//            () -> new StringJoiner(""),                 //supplier
//            (joiner,c) -> joiner.add(c.toString()),     //accumulator
//            (c1, c2) -> c1.merge(c2),                   //combiner
//            StringJoiner::toString);                    //finisher
//    String output = Arrays.asList(charArray)
//        .stream()
//        .collect(merger);
//    return output;

//    return Arrays.asList(charArray).stream()
//        .map(c -> c.toString())
//        .collect(Collectors.joining(""));

      return Arrays.asList(charArray).stream()
          .map(c -> (char)c)
          .flatMap(Arrays::stream)
          .collect(Collectors.joining(""));
  }
}

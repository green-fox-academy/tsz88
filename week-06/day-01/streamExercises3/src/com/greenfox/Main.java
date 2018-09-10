package com.greenfox;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {
	//exercise 9
      // Write a Stream Expression to convert a char array to a string!

      char[] charArray = {'a','b','c','d'};

      System.out.println(charArrayToString(charArray));
    }

  private static String charArrayToString(char[] charArray) {
    return Arrays.asList(charArray).stream()
        .collect(Collector.of(
            () -> new StringJoiner(""),
            (joiner,c) -> joiner.add(c.toString()),
            (c1, c2) -> c1.merge(c2),
            StringJoiner::toString
        ));
  }
}

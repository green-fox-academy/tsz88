package com.greenfox;

import java.util.HashMap;

public class LetterCounter {
  public String input;

  public LetterCounter(String x) {
    this.input = x;
  }

  public HashMap countThem() {
    HashMap letters = new HashMap<String, Integer>();
    letters.put(input.substring(0, 1), 1);
    for (int i = 1; i < input.length(); i++) {
      if (letters.containsKey(input.substring(i,i+1))) {
        Integer currentNumber = (Integer)letters.get(input.substring(i,i+1));
        letters.replace(input.substring(i,i+1), currentNumber+1);

      }
      else {
        letters.put(input.substring(i,i+1),1);
      }
    }
    return letters;
  }
}

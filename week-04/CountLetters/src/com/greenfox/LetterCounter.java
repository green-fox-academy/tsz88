package com.greenfox;

import java.util.HashMap;

public class LetterCounter {
  private String x;

  public LetterCounter(String x) {
    this.x = x;
  }

  public HashMap countThem() {
    HashMap letters = new HashMap<String, Integer>();
    letters.put(x.substring(0, 1), 1);
    for (int i = 0; i < x.length(); i++) {
      if (letters.containsKey(x.substring(i,i+1))) {
        int currentNumber = (int)letters.get(x.substring(i,i+1));
        letters.replace(x.substring(i,i+1),currentNumber+1);
      }
      else {
        letters.put(x.substring(i,i+1),1);
      }
    }
    return letters;
  }
}

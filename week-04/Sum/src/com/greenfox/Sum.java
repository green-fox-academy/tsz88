package com.greenfox;

import java.util.ArrayList;

public class Sum {

  public int sumMaker(ArrayList<Integer> x){
    int sum = 0;
    for (int i = 0; i < x.size(); i++){
      sum += x.get(i);
    }
    return sum;
  }
}

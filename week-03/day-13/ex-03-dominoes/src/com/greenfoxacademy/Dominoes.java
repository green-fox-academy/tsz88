package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

   // System.out.println(dominoes.get(0));
   // System.out.println(dominoes.get(0).getValues()[0]);

    List<Domino> reGrouped = new ArrayList<>();
    //the reGrouped list starts with the same element as the "dominoes" list
    reGrouped.add(0,dominoes.get(0));
    int n = dominoes.size();

    for (int i = 0; i < n; i++){
      int k = 0;
      while(k < dominoes.size()){
        if (reGrouped.get(i).getValues()[1] == dominoes.get(k).getValues()[0]){
          reGrouped.add(dominoes.get(k));
          dominoes.remove(k);
          break;
        } else {
          k++;
        }
      }
    }
    System.out.println(reGrouped);


    //System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
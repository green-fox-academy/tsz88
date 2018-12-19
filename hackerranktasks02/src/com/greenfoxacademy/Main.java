package com.greenfoxacademy;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();//number of queries //a + S(2^n-1 * b)
    int[] a = new int[t];
    int[] b = new int[t];
    int[] n = new int[t];

    for (int i = 0; i < t; i++) {
      a[i] = in.nextInt();
      b[i] = in.nextInt();
      n[i] = in.nextInt();
    }

    for (int j = 0; j < t; j++) {
      int sum = a[j] + b[j];
      System.out.print(sum + " ");
      for (int k = 1; k < n[j]; k++) {
        sum += (int) (Math.pow(2, k)) * b[j];
        System.out.print(sum + " ");
      }
      System.out.print("\n");
    }
    in.close();
  }
}

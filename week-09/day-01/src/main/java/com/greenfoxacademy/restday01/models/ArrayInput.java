package com.greenfoxacademy.restday01.models;

public class ArrayInput {
  int[] numbers;
  String what;

  public ArrayInput() {
  }

  public int getSum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

  public int getMultiply(int[] array) {
    if (array.length != 0 && array[0] != 0) {
      int out = 1;
      for (int i = 0; i < array.length; i++) {
        out *= array[i];
      }
      return out;
    } else
      return -1;
  }

  public int[] getDoubleArray(int[] array) {
    int[] doubles = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      doubles[i] = array[i] * 2;
    }
    return doubles;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}


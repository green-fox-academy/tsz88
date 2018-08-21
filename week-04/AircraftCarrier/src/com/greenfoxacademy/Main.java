package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    Carrier awesomeness = new Carrier(2300, 5000);

    awesomeness.add(new F16());
    awesomeness.add(new F16());
    awesomeness.add(new F35());
    awesomeness.add(new F35());

    awesomeness.status();
    System.out.println();

    awesomeness.fill();
    awesomeness.status();
  }
}

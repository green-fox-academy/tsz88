package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {

    Teacher tanár = new Teacher();
    Student diák = new Student();

    diák.question(tanár);
    tanár.teach(diák);
  }
}

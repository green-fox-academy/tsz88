package com.greenfoxacademy;

public class Person {
  static String name;
  static int age;
  static String gender;

//constructors

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }


  //methods
  public static void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + ".");
  }

  public static void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

}


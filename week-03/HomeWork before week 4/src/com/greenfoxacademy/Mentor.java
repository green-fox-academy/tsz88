package com.greenfoxacademy;

public class Mentor {
  static String name;
  static int age;
  static String gender;
  static String level;

  //constructors
  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  //methods
  public static void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + " " + level + " mentor.");
  }

  public static void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }


}

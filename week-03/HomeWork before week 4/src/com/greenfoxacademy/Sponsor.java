package com.greenfoxacademy;

public class Sponsor {

  static String name;
  static int age;
  static String gender;
  static String company;
  static int hiredStudents;

  //constructors
  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }


  //methods
  public static void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + " who represents " + company + " who hired " + hiredStudents + " students so far.");
  }

  public static void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public static void hire(){
    hiredStudents += 1;
  }

}

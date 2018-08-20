package com.greenfoxacademy;

public class Student {

    static String name;
    static int age;
    static String gender;
    static String previousOrganisation;
    static int skippedDays;

    //constructors


    public Student(String name, int age, String gender, String previousOrganisation){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.previousOrganisation = previousOrganisation;
    }

  public Student(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganisation = "The School of Life";
    skippedDays = 0;
  }

    //methods
    public static void introduce(){
      System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + " from " + previousOrganisation + " who skipped " + skippedDays + " days from the course already.");
    }

    public static void getGoal(){
      System.out.println("Be a junior software developer.");
    }

    public static void skipDays(int numberOfDays){
      skippedDays += numberOfDays;

  }


}

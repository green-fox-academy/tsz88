package com.greenfoxacademy;

public class Student extends Person {
  String previousOrganisation;
  int skippedDays;

  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + " from " + previousOrganisation + ", who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int days){
    skippedDays += days;
  }

  //constructors
  public Student(){
    super();
    previousOrganisation = "The School of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganisation){
    super(name, age, gender);
    this.previousOrganisation = previousOrganisation;
    skippedDays = 0;
  }

}

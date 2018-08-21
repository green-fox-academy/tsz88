package com.greenfoxacademy;

public class Mentor extends Person{

  String level;

  public void getGoal{
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + " " + level + " mentor.");
  }

  public Mentor(){
    super();
    level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }
}

package main.java.animals;

abstract public class Animal {
  protected String name;
  protected int age;

  public String getName(){
    return name;
  }

  public String reproduce(){
    return "";
  }
}

package com.greenfoxacademy;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    thirst = 50;
    hunger = 50;
  }

  public void eat(){
    hunger -= 1;
  }

  public void drink(){
    thirst -= 1;
  }

  public void play(){
    hunger += 1;
    thirst += 1;
  }

  public static void main(String[] args) {

    Animal donkey = new Animal();
    donkey.play();
    System.out.println(donkey.hunger);
    System.out.println(donkey.thirst);
  }
}

package com.greenfoxacademy.foxclub;

import java.util.ArrayList;

public class Fox {

  private String name;
  private ArrayList<String> tricks;
  private String food;
  private String drink;

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }




  public Fox(String name){
    this.name = name;
    tricks = new ArrayList<>();
    food = "salad";
    drink = "water";

  }

}

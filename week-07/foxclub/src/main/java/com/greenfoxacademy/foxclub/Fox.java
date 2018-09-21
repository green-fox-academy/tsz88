package com.greenfoxacademy.foxclub;

import java.util.ArrayList;
import java.util.Arrays;

public class Fox {

  private String name;
  private ArrayList<String> tricks;
  private String food;
  private String drink;

  public ArrayList<String> getFoodSource() {
    return foodSource;
  }

  public ArrayList<String> getDrinkSource() {
    return drinkSource;
  }

  private ArrayList<String> foodSource = new ArrayList<>(Arrays.asList("pizza", "cheeseburger", "pacal", "jelly beans", "salad"));
  private ArrayList<String> drinkSource = new ArrayList<>(Arrays.asList("water", "diet coke", "lemonade", "beer"));

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


  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    food = "salad";
    drink = "water";

  }

}

package com.greenfoxacademy;

public class Flower {
  double currentWater;
  String colour;
  String status;
  String type;

  public Flower(){
    currentWater = 0;
    status = "needs water";
    colour = "pink";
    type = "Flower";

  }

  public Flower(double currentWater, String colour){
    this.currentWater = currentWater;
    this.colour = colour;
    if (currentWater < 5){
      status = "needs water";
    } else {
      status = "does not need water";
    }
  }

  public void watering(double literWater){
    currentWater += literWater * 0.75;
  }

  public void checkStatus(){
    if (currentWater < 5){
      status = "needs water";
    } else {
      status = "does not need water";
    }
  }
}

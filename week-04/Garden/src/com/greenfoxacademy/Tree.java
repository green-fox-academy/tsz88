package com.greenfoxacademy;

public class Tree extends Flower {
  public Tree() {
    currentWater = 0;
    status = "needs water";
    colour = "white";
    type = "Tree";
  }

  public Tree(double currentWater, String colour) {
    this.currentWater = currentWater;
    type = "Tree";
    if (currentWater < 10) {
      status = "needs water";
    } else {
      status = "does not need water";
    }
  }

  public void watering(double literWater) {
    currentWater += literWater * 0.4;
  }

  public void checkStatus() {
    if (currentWater < 10) {
      status = "needs water";
    } else {
      status = "does not need water";
    }
  }
}

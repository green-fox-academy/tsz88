package com.greenfoxacademy;

import java.util.ArrayList;

public class Garden {
  public ArrayList<Flower> gardenPlants = new ArrayList<>();

  public void add(Flower plant) {
    gardenPlants.add(plant);
  }

  public void irrigate(double Liters) {
    System.out.println("Watering with " + Liters);
    int thirstyFlower = 0;
    for (int i = 0; i < gardenPlants.size(); i++) {
      if (gardenPlants.get(i).status.equals("needs water")) {
        thirstyFlower += 1;
      }
    }
    for (int k = 0; k < gardenPlants.size(); k++) {
      if (gardenPlants.get(k).status.equals("needs water")) {
        gardenPlants.get(k).watering((Liters / thirstyFlower));
        gardenPlants.get(k).checkStatus();
      }
    }
    statusOfGarden();
  }

  public void statusOfGarden() {
    for (int j = 0; j < gardenPlants.size(); j++) {
      if (gardenPlants.get(j) instanceof Tree) {
        System.out.println("The " + gardenPlants.get(j).colour + " Tree " + (gardenPlants.get(j)).status + ".");
      } else {
        System.out.println("The " + gardenPlants.get(j).colour + " Flower " + gardenPlants.get(j).status + ".");
      }
    }
  }
}
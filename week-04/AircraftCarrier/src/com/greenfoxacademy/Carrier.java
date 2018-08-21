package com.greenfoxacademy;

import java.util.ArrayList;

public class Carrier {
  ArrayList<Aircraft> carrier = new ArrayList<>();
  int carrierAmmo;
  int healthPoints;

  public Carrier(int initialCarrierAmmo, int healthPoints){
    this.carrierAmmo = initialCarrierAmmo;
    this.healthPoints = healthPoints;
  }

  public void add(Aircraft x){
    carrier.add(x);
  }

  public void fill(){
    
    if (carrierAmmo <= 0){
      System.out.println("No ammo to fill.");
    } else if (){
      for(int i = 0; carrierAmmo > 0 && i < carrier.size(); i++){
        if(carrier.get(i).isPrority()){
          carrierAmmo = carrier.get(i).refill(carrierAmmo);
          i++;
        }
      }
    } else {

    }

  }
}

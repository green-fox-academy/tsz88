package com.greenfoxacademy;

import java.util.ArrayList;

public class Carrier {
  ArrayList<Aircraft> carrier = new ArrayList<>();
  int carrierAmmo;
  int healthPoints;

  public Carrier(int initialCarrierAmmo, int healthPoints) {
    this.carrierAmmo = initialCarrierAmmo;
    this.healthPoints = healthPoints;
  }

  public void add(Aircraft x) {
    carrier.add(x);
  }

  public void fill() {
    int totalFillable = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalFillable += carrier.get(i).maxAmmo - carrier.get(i).ammo;
    }
    if (carrierAmmo <= 0) { //no ammo exception
      System.out.println("No ammo to fill.");
    }
    if (totalFillable < carrierAmmo) { //enough ammo to fill all aircrafts
      for (int j = 0; j < carrier.size(); j++) {
        carrierAmmo = carrier.get(j).refill(carrierAmmo);
      }
    } else {
      //start by filling the priority planes
      for (int k = 0; k < carrier.size() && carrierAmmo > 0; k++)
        if (carrier.get(k).isPrority()) {
          carrierAmmo = carrier.get(k).refill(carrierAmmo);
        } else {
        }
      //fill up no-priority planes as well until it runs out of ammo
      int l = 0;
      while (carrierAmmo > 0) {
        carrierAmmo = carrier.get(l).refill(carrierAmmo);
        l++;
      }
    }
  }

  public void fight(Carrier B) {
    int totalFirePower = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalFirePower += carrier.get(i).fight();
    }
    B.healthPoints -= totalFirePower;
  }

  public void status() {
    int totalDamage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalDamage += carrier.get(i).maxAmmo * carrier.get(i).baseDamage;
    }

    if (healthPoints <= 0) {
      System.out.println("It's dead, Jim.:-(");
    } else {
      System.out.println("HP: " + healthPoints + ", Aircraft count: " + carrier.size() + ", AmmoStorage: " + carrierAmmo + ", Total damage: " + totalDamage + ".\n Aircrafts:");
      for (int k = 0; k < carrier.size(); k++) {
        carrier.get(k).getstatus();
      }
    }
  }
}

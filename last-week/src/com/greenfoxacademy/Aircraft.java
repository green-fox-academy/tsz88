package com.greenfoxacademy;

public class Aircraft implements AirCraftActions {
  String type;
  int currentAmmo;
  int baseDamage;

  public Aircraft(){
    currentAmmo = 0;
  }

  @Override
  public int fight() {
    int currentDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return currentDamage;
  }

  @Override
  public int refill(int ammoAvailable) {
    return 0;
  }

  @Override
  public String getType() {
    return null;
  }

  @Override
  public String getStatus() {
    return null;
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}

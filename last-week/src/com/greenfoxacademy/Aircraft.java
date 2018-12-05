package com.greenfoxacademy;

public abstract class Aircraft implements AirCraftActions {
  String type;
  int currentAmmo;
  int baseDamage;
  int maxAmmo;

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
    int fillable = maxAmmo - currentAmmo;
    if (fillable > ammoAvailable){
      currentAmmo += ammoAvailable;
      return 0;
    } else {
      currentAmmo = maxAmmo;
      return ammoAvailable - fillable;
    }
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

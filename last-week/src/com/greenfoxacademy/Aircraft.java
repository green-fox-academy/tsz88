package com.greenfoxacademy;

public abstract class Aircraft implements AirCraftActions {
  JetType type;
  protected int currentAmmo;
  protected int baseDamage;
  protected int maxAmmo;

  public Aircraft() {
    currentAmmo = 0;
  }

  public Aircraft(int baseDamage, int maxAmmo){
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
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
    if (fillable > ammoAvailable) {
      fillable = ammoAvailable;
    }
    currentAmmo += fillable;
    return ammoAvailable - fillable;
  }

  @Override
  public String getType() {
    return type.toString();
  }

  @Override
  public String getStatus() {
    StringBuilder reply = new StringBuilder();
    reply.append("Type: " + type.toString() + ", ");
    reply.append("Ammo: " + currentAmmo + ", ");
    reply.append("Base Damage: " + baseDamage + ", ");
    reply.append("All Damage: " + baseDamage * currentAmmo);
    return reply.toString();
  }

  @Override
  public boolean isPriority() {
    return false;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int intendedAmmoLevel){
    this.currentAmmo = intendedAmmoLevel % maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }
}

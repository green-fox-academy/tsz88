package com.greenfoxacademy;

public class Aircraft {
  protected String type;
  protected int ammo;
  protected int baseDamage;
  public int maxAmmo;


  public Aircraft(){
    ammo = 0;
  }

  public int fight(){
    int damage = ammo * baseDamage;
    ammo = 0;
    return damage;
  }

  public int refill(int availableAmmo){
    if (maxAmmo-ammo > availableAmmo){
      ammo += availableAmmo;
      availableAmmo = 0;
    } else {
      availableAmmo = availableAmmo - (maxAmmo - ammo);
      ammo = maxAmmo;
    } return availableAmmo;
  }

  public String getType(){
    return type;
  }
  public void getstatus(){
    System.out.println("Type: " + type + ",\nAmmo: " + ammo + ",\nBase damage: " + baseDamage + "\n All damage: " + ammo * baseDamage);
  }
  public boolean isPrority(){
    if (type.equals("F35")){
      return true;
    } else {
      return false;
    }
  }


}

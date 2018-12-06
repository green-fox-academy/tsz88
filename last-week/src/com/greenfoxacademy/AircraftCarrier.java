package com.greenfoxacademy;

import java.util.List;
import java.util.stream.Collectors;

public class AircraftCarrier implements CarrierActions {
  protected List<Aircraft> listOfJetsOnCarrier;
  protected int ammoStorageOfCarrier;
  protected int healthPointsOfCarrier;
  public String nameOfAircraftCarrier;

  public AircraftCarrier(int ammoStorageOfCarrier, int healthPointsOfCarrier) {
    this.ammoStorageOfCarrier = ammoStorageOfCarrier;
    this.healthPointsOfCarrier = healthPointsOfCarrier;
  }

  @Override
  public void add(Aircraft aircraft) {
    listOfJetsOnCarrier.add(aircraft);
  }

  @Override
  public void fill() throws Exception {
    List<Aircraft> priorityAircrafts = listOfJetsOnCarrier.stream()
        .filter(aircraft -> aircraft.isPriority())
        .collect(Collectors.toList());
    for (Aircraft iteratedJet : priorityAircrafts) {
      checkIfCarrierHasAmmoToLoadAnything();
      ammoStorageOfCarrier = iteratedJet.refill(ammoStorageOfCarrier);
    }

    List<Aircraft> nonPriorityAircrafts = listOfJetsOnCarrier.stream()
        .filter(aircraft -> !aircraft.isPriority())
        .collect(Collectors.toList());

    for (Aircraft iteratedJet: nonPriorityAircrafts){
      checkIfCarrierHasAmmoToLoadAnything();
      ammoStorageOfCarrier = iteratedJet.refill(ammoStorageOfCarrier);
    }
  }

  public void checkIfCarrierHasAmmoToLoadAnything() throws Exception {
    if (ammoStorageOfCarrier <= 0){
      throw new Exception("Has no ammo to fill aircrafts.");
    }
  }

  private int totalDamageOfCarrier(){
    int result = 0;
    for (Aircraft iteratedAircraft : listOfJetsOnCarrier){
      result += iteratedAircraft.baseDamage * iteratedAircraft.currentAmmo;
    }
    return result;
  }

  private void emptyAllAircrafts(){
    for (Aircraft iteratedAircraft : listOfJetsOnCarrier) {
      iteratedAircraft.setCurrentAmmo(0);
    }
  }

  private void evaluateIfTheEnemyLost(AircraftCarrier enemy){
    if (enemy.healthPointsOfCarrier <= 0) {
      System.out.println(enemy.nameOfAircraftCarrier + " has lost the battle.");
    }
  }

  @Override
  public void fight(AircraftCarrier enemyAircraftCarrier) {
    enemyAircraftCarrier.healthPointsOfCarrier -= totalDamageOfCarrier();
    this.emptyAllAircrafts();
    evaluateIfTheEnemyLost(enemyAircraftCarrier);
  }

  @Override
  public String getStatus() {
    StringBuilder longStatusToPrint = new StringBuilder();
    longStatusToPrint.append("HP: " + healthPointsOfCarrier + ", ");
    longStatusToPrint.append("Aircraft count: " + listOfJetsOnCarrier.size() + ", ");
    longStatusToPrint.append("Ammo storage: " + ammoStorageOfCarrier + ", ");
    longStatusToPrint.append("Total damage: " + totalDamageOfCarrier() + "\n");
    for (Aircraft iteratedAircraft: listOfJetsOnCarrier){
      longStatusToPrint.append(iteratedAircraft.getStatus() + "\n");
    }
    return longStatusToPrint.toString();
  }
}

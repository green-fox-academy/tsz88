package com.greenfoxacademy;

import java.util.List;
import java.util.stream.Collectors;

public class AircraftCarrier implements CarrierActions {
  protected List<Aircraft> listOfJetsOnCarrier;
  protected int ammoStorageOfCarrier;
  protected int healthPointsOfCarrier;

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

  @Override
  public void fight(Aircraft aircraft) {

  }

  @Override
  public String getStatus() {
    return null;
  }
}

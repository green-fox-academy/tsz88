package com.greenfoxacademy;

import java.util.List;

public class AircraftCarrier implements CarrierActions {
  protected List<Aircraft> listOfJetsOnCarrier;
  protected int ammoStorageOfCarrier;
  protected int healthPointsOfCarrier;

  public AircraftCarrier(int ammoStorageOfCarrier, int healthPointsOfCarrier){
    this.ammoStorageOfCarrier = ammoStorageOfCarrier;
    this.healthPointsOfCarrier = healthPointsOfCarrier;
  }

  @Override
  public void add(Aircraft aircraft) {
    listOfJetsOnCarrier.add(aircraft);
  }

  @Override
  public void fill() {
    for (Aircraft iteratedJet: listOfJetsOnCarrier) {
      iteratedJet.refill(ammoStorageOfCarrier);
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

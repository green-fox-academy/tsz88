package com.greenfoxacademy.groot.models;

public class ShipStatusReport {

  String received;
  int amount;
  String shipstatus;
  boolean ready;

  public ShipStatusReport(SpaceShip spaceShip, NewLoadForSpaceShip newLoadForSpaceShip){
    this.received = newLoadForSpaceShip.getReceived();
    this.amount = newLoadForSpaceShip.getAmount();
    this.shipstatus = spaceShip.getShipstatus();
    this.ready = spaceShip.getReady();
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}

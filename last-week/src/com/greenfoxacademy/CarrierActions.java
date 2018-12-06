package com.greenfoxacademy;

public interface CarrierActions {

  void add(Aircraft aircraft);
  void fill() throws Exception;
  void fight(AircraftCarrier aircraftCarrier);
  String getStatus();
}

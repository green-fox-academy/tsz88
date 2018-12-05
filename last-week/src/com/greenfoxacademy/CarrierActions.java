package com.greenfoxacademy;

public interface CarrierActions {

  void add(Aircraft aircraft);
  void fill();
  void fight(Aircraft aircraft);
  String getStatus();
}

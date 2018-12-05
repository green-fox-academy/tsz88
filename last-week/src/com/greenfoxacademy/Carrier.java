package com.greenfoxacademy;

public interface Carrier {

  void add(Aircraft aircraft);
  void fill();
  void fight(Aircraft aircraft);
  String getStatus();
}

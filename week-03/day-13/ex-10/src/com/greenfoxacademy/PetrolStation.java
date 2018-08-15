package com.greenfoxacademy;

public class PetrolStation {

  public static void main(String[] args) {
    Station esso = new Station();
    Car opel = new Car();

    System.out.println("Station's gasAmount: " + esso.gasAmount);
    System.out.println("Car's gasAmount: " + opel.gasAmount);

    esso.refill(opel);
    System.out.println("Station's gasAmount: " + esso.gasAmount);
    System.out.println("Car's gasAmount: " + opel.gasAmount);
  }
}

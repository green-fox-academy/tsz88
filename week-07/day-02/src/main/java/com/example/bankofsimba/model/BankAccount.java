package com.example.bankofsimba.model;

public class BankAccount {

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  String name;
  double balance;
  String animalType;

  public BankAccount(String name, int balance, String animalType){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}

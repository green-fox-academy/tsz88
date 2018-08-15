package com.greenfoxacademy;

public class Sharpie {
  String colour;
  Double width;
  Double inkAmount;

  public Sharpie(String colour,Double width){
    this.colour = colour;
    this.width = width;
    inkAmount = 100.0;
  }
  public void use(){
    inkAmount -= 5;
  }
  public static void main(String[] args) {

  }
}

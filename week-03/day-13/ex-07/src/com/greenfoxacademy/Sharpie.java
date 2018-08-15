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
	  Sharpie highlighter = new Sharpie("yellow",4.0);
	  highlighter.use();
    System.out.println("Colour: "+highlighter.colour);
    System.out.println("Width: "+highlighter.width);
    System.out.println("inkamount: "+highlighter.inkAmount);
    }
}

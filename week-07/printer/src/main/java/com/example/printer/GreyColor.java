package com.example.printer;

public class GreyColor implements MyColor {
  @Override
  public void printColor() {
    printer.log("It is grey in color...");
  }
}

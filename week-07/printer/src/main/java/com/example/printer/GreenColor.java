package com.example.printer;

public class GreenColor implements MyColor{
  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}

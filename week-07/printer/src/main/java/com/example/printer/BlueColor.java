package com.example.printer;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    printer.log("It is blue in color...");
  }
}

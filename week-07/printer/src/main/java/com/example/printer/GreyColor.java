package com.example.printer;

import org.springframework.stereotype.Service;

@Service
public class GreyColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is grey in color...");
  }
}

package com.example.printer;

import org.springframework.beans.factory.annotation.Autowired;

public interface MyColor {

  void printColor();

  @Autowired
  Printer printer = new Printer();
}

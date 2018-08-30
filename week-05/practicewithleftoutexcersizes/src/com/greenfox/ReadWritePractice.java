package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ReadWritePractice {

  //Read the third line of the caesar code and print it into a new file

  public static void copyThirdLinePrintElsewhere() {
    Path path = Paths.get("caesar.txt");
    try {
      String theLineIWant = Files.readAllLines(path).get(3);
      System.out.println(theLineIWant);
    } catch (IOException x) {
    }
  }
}

package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class ReadWritePractice {

  //Read the third line of the caesar code and print it into a new file

  public static void copyThirdLinePrintElsewhere() {
    Path path = Paths.get("caesar.txt");
    try {
      String theLineIWant = Files.readAllLines(path).get(3);
      System.out.println(theLineIWant);
      List<String> x = Arrays.asList(theLineIWant);
      Files.createFile(Paths.get("output.txt"));
      Files.write(Paths.get("output.txt"),theLineIWant.getBytes(),StandardOpenOption.APPEND);

    } catch (IOException x) {
    }
  }
}

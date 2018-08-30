package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, tell me the name of the studio!");
    String name = scanner.nextLine();

    Path path = Paths.get(name + ".csv");

    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    } catch (IOException x){
      System.out.println("Cannot find studio, please try again later.");
    }

    //arraylist with all entries separated by commas
    ArrayList<String[]> eachEntryInFile = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++){
      eachEntryInFile.add(lines.get(i).split(Pattern.quote(",")));
    }

    //statistics lists the specific year, and how many movies were made in it
    HashMap<Integer,Integer> statistics = new HashMap();
    for (int j = 0; j < eachEntryInFile.size(); j++){
      statistics.put(Integer.valueOf(eachEntryInFile.get(j)[1]),statistics.get(Integer.valueOf(eachEntryInFile.get(j)[1]) + 1));
    }

    //search for the year with highest number of movies made in
    int mostMoviesNumber = 0;
    for (int k = 0; k < statistics.size(); k++){
      if (mostMoviesNumber < statistics.get(k)){
        mostMoviesNumber = statistics.get(k)
      }
    }


  }
}

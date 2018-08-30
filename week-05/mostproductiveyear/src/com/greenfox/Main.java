package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
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
      if (!statistics.containsKey(Integer.valueOf(eachEntryInFile.get(j)[1]))){
        statistics.put(Integer.valueOf(eachEntryInFile.get(j)[1]), 1);
      }
      else {
        statistics.replace(Integer.valueOf(eachEntryInFile.get(j)[1]), (statistics.get(Integer.valueOf(eachEntryInFile.get(j)[1])) + 1));
      }
    }

    //search for the year with highest number of movies made in
    int mostMoviesNumber = 0;
    ArrayList<Integer> succesfulYears = new ArrayList<>();
    for (Map.Entry<Integer,Integer> entry : statistics.entrySet()){
      if (entry.getValue() > mostMoviesNumber){
        mostMoviesNumber = entry.getValue();
      }
    }

    //collect out all the years that had that many movies made
    for (Map.Entry<Integer,Integer> entry : statistics.entrySet()){
      if (entry.getValue() == mostMoviesNumber){
        succesfulYears.add(entry.getKey());
      }
    }

    //make a pretty string of the successful years
    String output = Integer.toString(succesfulYears.get(0));
    for (int g = 1; g < succesfulYears.size(); g++){
      output += ", " + Integer.toString(succesfulYears.get(g));
    }

    System.out.println(name + " has made the most movies in " + output);
  }
}

package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    LineInMovie egy = new LineInMovie(101, "Matrix");
    LineInMovie ketto = new LineInMovie(102, "Kung Fu Panda");
    ArrayList<LineInMovie> movies = new ArrayList<>();
    movies.add(egy);
    movies.add(ketto);

    LineInRating vmi1 = new LineInRating(101, 5);
    LineInRating vmi2 = new LineInRating(101, 4);
    LineInRating vmi3 = new LineInRating(102, 5);
    LineInRating vmi4 = new LineInRating(102, 1);
    ArrayList<LineInRating> ratings = new ArrayList<LineInRating>(Arrays.asList(vmi1, vmi2, vmi3, vmi4));

    System.out.println(LineInRating.ratingRange(ratings, 102));
    System.out.println(titleAndRatingRange(102, movies, ratings));
    printSolution(movies, ratings);
  }

  public static void printAllStuff(ArrayList<LineInMovie> titles, ArrayList<LineInRating> ratings){
    for (int i = 0; i < titles.size(); i++){

    }
  }

  public static String titleAndRatingRange(Integer movieID, ArrayList<LineInMovie> titles, ArrayList<LineInRating> ratings) {
    String output = "";
    output += titles.stream()
        .filter(lineInMovie -> lineInMovie.getmID().equals(movieID))
        .reduce((lineInMovie, lineInMovie2) -> lineInMovie)
        .get().getTitle();

    output += " - ";
    output += LineInRating.ratingRange(ratings, movieID).toString();
    return output;
  }

//  public static ArrayList<Object> cucc2(ArrayList<LineInMovie> titles, ArrayList<LineInRating> ratings){
//    //merge the two
//    ArrayList<Object> mergedTable = ratings.stream()
//        .forEach(lineInRating -> new ArrayList<Object>(Arrays.asList(lineInRating.getmID(),lineInRating.getRating(),LineInMovie.)));
//  }

   public static void printSolution(ArrayList<LineInMovie> titles, ArrayList<LineInRating> ratings) {
    titles.stream()
        .map(lineInMovie -> new ArrayList(Arrays.asList(lineInMovie.getTitle(), LineInRating.ratingRange(ratings, lineInMovie.getmID()))))
        .forEach(System.out::println);
  }
}




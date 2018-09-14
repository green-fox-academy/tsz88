package com.greenfox;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

  public static void main(String[] args) {
    LineInMovie egy = new LineInMovie(101, "Matrix");
    LineInMovie ketto = new LineInMovie(102, "Kung Fu Panda");
    ArrayList<LineInMovie> movie = new ArrayList<>();
    movie.add(egy);
    movie.add(ketto);

    LineInRating vmi1 = new LineInRating(101, 5);
    LineInRating vmi2 = new LineInRating(101, 4);
    LineInRating vmi3 = new LineInRating(102, 5);
    LineInRating vmi4 = new LineInRating(102, 1);
    ArrayList<LineInRating> ratings = new ArrayList<LineInRating>(Arrays.asList(vmi1, vmi2, vmi3, vmi4));
  }


  

}




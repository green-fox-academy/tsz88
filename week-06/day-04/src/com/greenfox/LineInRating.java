package com.greenfox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LineInRating {
  private Integer mID;
  private Integer rating;

  public LineInRating(Integer mID, Integer rating){
    this.mID=mID;
    this.rating=rating;
  }

  public Integer getmID(){
    return mID;
  }

  public Integer getRating(){
    return rating;
  }

  public static Integer ratingRange(ArrayList<LineInRating> ratingList, Integer mIDInThisCase) {
    List<Integer> ratingsOfThisMovie = ratingList.stream()
        .filter(lineInRating -> lineInRating.getmID().equals(mIDInThisCase))
        .map(lineInRating -> lineInRating.getRating())
        .collect(Collectors.toList());
    return ratingsOfThisMovie.stream().max(Comparator.comparing(Integer::valueOf)).get() - ratingsOfThisMovie.stream().min(Comparator.comparing(Integer::valueOf)).get();
  }
}

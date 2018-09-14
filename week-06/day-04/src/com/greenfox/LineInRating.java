package com.greenfox;

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
}

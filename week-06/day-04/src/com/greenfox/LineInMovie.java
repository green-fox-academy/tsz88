package com.greenfox;

public class LineInMovie {
  private Integer mID;
  private String title;


  public LineInMovie(Integer mID, String title){
    this.mID = mID;
    this.title = title;
  }

  public Integer getmID(){
    return mID;
  }

  public String getTitle(){
    return title;
  }
}

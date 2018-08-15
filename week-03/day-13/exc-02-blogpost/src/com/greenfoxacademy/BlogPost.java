package com.greenfoxacademy;

import java.sql.SQLOutput;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(){
    authorName = "?";
    title = "no title";
    text = "no text";
    publicationDate = "no publication date";
  }

  public BlogPost(String name, String posttitle, String date){
    this.authorName = name;
    this.title = posttitle;
    this.publicationDate = date;
  }

  public void text(String vmi){
    text = vmi;
  }

  public void print(){
    System.out.println(title);
    System.out.println("by "+authorName);
    System.out.println(publicationDate);
    System.out.println();
    System.out.println(text);
  }

}

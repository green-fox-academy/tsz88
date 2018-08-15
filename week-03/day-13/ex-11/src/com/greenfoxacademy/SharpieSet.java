package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
ArrayList<Sharpie> set;

  public SharpieSet(){
    List<Sharpie> set = new ArrayList<>();
  }

  public ArrayList<Sharpie> add(Sharpie sharpie){
    set.add(sharpie);
    return set;
  }
}

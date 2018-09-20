package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

  ArrayList<Fox> allFoxList = new ArrayList<>();


  public void addToAllFoxList(Fox fox) {
    allFoxList.add(fox);
  }

  public Fox findFoxByName(String name){
    for (Fox fox : allFoxList){
      if (fox.getName().equals(name)){
        return fox;
      }
    } return null;
  }

  public boolean suchFoxNameExists(String name){
    for (Fox fox: allFoxList){
      if (fox.getName().equals(name)){
        return true;
      }
    }
    return false;
  }
}
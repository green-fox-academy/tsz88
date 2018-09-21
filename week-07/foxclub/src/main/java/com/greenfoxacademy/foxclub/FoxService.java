package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class FoxService {

  Map<String, Fox> allFoxList = new HashMap<>();

  public void addToAllFoxList(Fox fox) {
    allFoxList.put(fox.getName(), fox);
  }

  public Fox findFoxByName(String name){
    if (allFoxList.containsKey(name)){
      return allFoxList.get(name);
    }
    else return null;
  }

  public void addTrickToFox(Fox fox, String skill){
    if (!fox.getTricks().contains(skill)){
      fox.getTricks().add(skill);
    }
  }

  public Map<String, Fox> populateAllFoxMap(){
    Fox adalbert = new Fox("Adalbert");
    Fox bob = new Fox ("Bob");
    adalbert.setFood("pacal");
    bob.setDrink("diet coke");
    allFoxList.put(adalbert.getName(), adalbert);
    allFoxList.put(bob.getName(), bob);
    return allFoxList;
  }
}
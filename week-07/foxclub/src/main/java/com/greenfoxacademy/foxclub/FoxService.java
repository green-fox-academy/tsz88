package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
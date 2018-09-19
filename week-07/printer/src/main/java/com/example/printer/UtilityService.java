package com.example.printer;

import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import java.util.ArrayList;
import java.util.Random;

public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public static Boolean validateEmail(String s){
    String a = "@";
    String b = ".";
    EmailValidator x = new EmailValidator();
    //return x.isValid(s,null);
    return (s.contains(a) && s.contains(b));
  }


}

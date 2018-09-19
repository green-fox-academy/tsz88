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
    //return x.isValid(s,null);  this does not mind dots
    return (s.contains(a) && s.contains(b));
  }

  public static String encodeCeasarCode(int shift, String text){
    //https://stackoverflow.com/questions/19108737/java-how-to-implement-a-shift-cipher-caesar-cipher

    String output = "";
    char c;
    for (int i = 0; i < text.length(); i++) {
      c = (char)(text.charAt(i) + (shift % 26));
      output += c;
    }
    return output;
  }

}

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

  public static String encodeCeasarCode(int shift, String text) {
    //https://www.rosettacode.org/wiki/Caesar_cipher#Java

    String output = "";
    shift = shift % 26 + 26;
    for (char i : text.toCharArray()) {
      if (Character.isLetter(i)) {
        if (Character.isUpperCase(i)) {
          output += (char) ('A' + (i - 'A' + shift) % 26);
        } else {
          output += (char) ('a' + (i - 'a' + shift) % 26);
        }
      } else {
        output += i;
      }
    }
    return output;
  }

  public static String encode(String enc, int offset) {
    offset = offset % 26 + 26;
    StringBuilder encoded = new StringBuilder();
    for (char i : enc.toCharArray()) {
      if (Character.isLetter(i)) {
        if (Character.isUpperCase(i)) {
          encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
        } else {
          encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
        }
      } else {
        encoded.append(i);
      }
    }
    return encoded.toString();
  }
}

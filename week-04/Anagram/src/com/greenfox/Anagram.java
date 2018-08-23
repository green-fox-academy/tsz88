package com.greenfox;

public class Anagram {

  public boolean ifAnagrams(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    } else {
      //erase the same characters

      for (int i = 0; i < b.length(); i++) {
        int j = 0;
        while (j < b.length()) {
          if (b.charAt(j) == a.charAt(0)) {
            a = a.substring(1);
            break;
          } else {
            j++;
          }
        }
      } return a.isEmpty();
    }
  }
}

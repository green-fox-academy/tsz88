package com.greenfox;

public class Anagram {

  public boolean ifAnagrams(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    } else {
      //erase the same characters
     for (int i = 0; i < a.length(); i++) {
        int j = 0;
        if (b.isEmpty()){
          break;
        }
        while (j < b.length()) {
          if (b.charAt(j) == a.charAt(i)) {
            b = b.substring(0,j) + b.substring(j+1);
           // a = a.substring(1);
            break;
          } else {
            j++;
          }
        }
      }
      return b.isEmpty();
    }
  }
}

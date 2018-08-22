package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {

      Gnirts nesze = new Gnirts("annyiradejó");
      System.out.println(nesze.length());
      System.out.println(nesze.charAt(1));
      System.out.println(nesze.subSequence(0,4));

      Shifter csak = new Shifter("jóvan", 3);
      System.out.println(csak.charAt(2));
      System.out.println(csak.subSequence(2,4));
    }

}

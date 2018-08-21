package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    Garden kert = new Garden();
    kert.add(new Flower(0, "yellow"));
    kert.add(new Flower(0, "blue"));
    kert.add(new Tree(0, "purple"));
    kert.add(new Tree(0, "orange"));

    kert.statusOfGarden();

    kert.irrigate(40);

    kert.irrigate(70);

  }
}

package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class KochLine {
  static ArrayList<Integer> xDots = new ArrayList<>();
  static ArrayList<Integer> yDots = new ArrayList<>();

  public static void mainDraw(Graphics graphics) {

  }

  public static int[] xDotGenerator(int x1, int x2, int setNumber) {
    if (setNumber < 1) {
      xDots.set(0, x1);
      Integer[] out = xDots.toArray(new Integer[xDots.size()]);
      return out;
    } else {
    int i = (int)(Math.pow(4, setNumber));
    xDots.add(i, x2);
    xDots.add(i-1, (x2-x1)*2/3);
    xDots.add(i-2, (x2-x1)/2);
    xDots.add(i-3,(x2-x1)/3);
    try{
      xDotGenerator(xDots.get(i-5),xDots.get(i-4),setNumber-1);
  } finally {
    }
    }
    }

  public static int[] yDotGenerator(int y1, int y2, int setNumber) {
    if (setNumber < 1) {
      xDots.set(0, y1);
      Integer[] out2 = yDots.toArray(new Integer[yDots.size()]);
      return out2;
      } else {
      int i = (int)(Math.pow(4, setNumber));
      xDots.add(i, y2);
      xDots.add(i-1, (y2-y1)*2/3);
      xDots.add(i-2, (y2-y1)/2);
      xDots.add(i-3,(y2-y1)/3);
      try{
        xDotGenerator(xDots.get(i-5),xDots.get(i-4),setNumber-1);
      } finally {
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
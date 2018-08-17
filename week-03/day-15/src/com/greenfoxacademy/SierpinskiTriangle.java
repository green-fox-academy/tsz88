package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiTriangle {
  public static void mainDraw(Graphics graphics){
    recursiveTriangles(1000,0,0,graphics);

  }
  public static void basicTriangle(int size, int x, int y, Graphics graphics){
    int height = (int)(Math.sqrt(3)/2*size);
    int[] xPoints = {x, x+size, x+size/2};
    int[] yPoints = {y, y, y+height};
    int nPoints = 3;

    graphics.drawPolygon(xPoints,yPoints,nPoints);
  }

  public static void recursiveTriangles(int size, int x, int y, Graphics graphics){
    if(size < 10){
    } else {
      basicTriangle(size, x, y, graphics);
      recursiveTriangles(size/2, x, y, graphics);
      recursiveTriangles(size/2, x+size/2, y, graphics);
      recursiveTriangles(size/2, x+size/4, y+(int)(Math.sqrt(3)/2*size)/2, graphics);
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
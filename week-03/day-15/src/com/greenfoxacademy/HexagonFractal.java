package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonFractal {
  public static void mainDraw(Graphics graphics){
    basicUnit(450,300,50,graphics);



  }

  public static void basicUnit(int side, int x, int y, Graphics graphics){
    //first point is the top left edge of the hexagon
    int height = (int)(Math.sqrt(3)/2*side);
    int[] xPoints = {x, x + side, x + side * 3 / 2, x + side, x, x - side / 2};
    int[] yPoints = {y, y, y + height, y + height * 2, y + height * 2, y + height};

    graphics.drawPolygon(xPoints,yPoints,6);
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
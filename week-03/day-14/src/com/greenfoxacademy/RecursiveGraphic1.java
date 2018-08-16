package com.greenfoxacademy;

import sun.java2d.windows.GDIRenderer;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveGraphic1 {
  public static void mainDraw(Graphics graphics) {
    fractal(WIDTH,graphics);

  }
  public static void basic(int origoX, int origoY, int size, Graphics graphics){
    for (int row = 0; row < 3; row++){
      for (int column = 0; column < 3; column++){
        int x = (row * size / 3) + origoX;
        int y = (column * size / 3) + origoY;
        if ((row % 2) != (column % 2)){
          graphics.drawRect(x,y,size/3,size/3);
        }
      }
    }
  }
  public static void fractal(int n, Graphics graphics){
    if (n < 9) {
    } else {
      int x = WIDTH / 2 - n / 2;
      int y = 0 ;
      basic(x,y,n,graphics);
      fractal(n / 3,graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

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
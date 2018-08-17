package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics){
    fractalPattern(300, 310,310,graphics);
  }
  public static void fractalPattern(int size, int x, int y, Graphics graphics){
    if(size < 1){
    } else {
      graphics.fillRect(x, y, size,size);
      //left side column
      fractalPattern(size/3,x-size*2/3, y-size*2/3, graphics);
      fractalPattern(size/3,x-size*2/3, y+size/3, graphics);
      fractalPattern(size/3,x-size*2/3, y+size*4/3, graphics);
      //center
      fractalPattern(size/3, x+size/3, y-size*2/3, graphics);
      fractalPattern(size/3, x+size/3, y+size*4/3, graphics);
      //right side column
      fractalPattern(size/3, x+size*4/3, y-size*2/3, graphics);
      fractalPattern(size/3, x+size*4/3, y+size/3, graphics);
      fractalPattern(size/3, x+size*4/3, y+size*4/3, graphics);


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

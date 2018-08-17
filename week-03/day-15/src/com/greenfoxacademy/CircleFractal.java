package com.greenfoxacademy;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CircleFractal {
  public static void mainDraw(Graphics graphics){
    fractalDrawer(200,260,260,graphics);


  }
  public static void theUnit(int ray, int xOfOrigo, int yOfOrigo, Graphics graphics){
    graphics.drawOval(xOfOrigo-ray,yOfOrigo-ray,2*ray, 2*ray);
  }
  public static void fractalDrawer(int ray, int xCenter, int yCenter, Graphics graphics){
    if(ray < 10){
    } else {
      theUnit(ray, xCenter, yCenter,graphics);
      fractalDrawer(ray/2, xCenter-(int)(Math.sqrt(3)/4*ray),yCenter+ray/4,graphics);
      fractalDrawer(ray/2, xCenter,yCenter-ray/2,graphics);
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
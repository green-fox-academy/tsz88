package com.greenfoxacademy;

import sun.java2d.windows.GDIRenderer;

import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class BeeHiveDrawing{
  public static void mainDraw(Graphics graphics){
//    int xpoints[] = {25, 145, 25, 145, 25};
//    int ypoints[] = {25, 25, 145, 145, 25};
//    int npoints = 5;
//
//    graphics.drawPolygon(xpoints, ypoints, npoints);
    hexagon(30,30,500,graphics);
    int yTile = 30; int size = 500;
    System.out.println(yTile+Math.sqrt(3)/4*size);
  }
  //side of the hexagon is size/2 long
  public static void hexagon(int xTile, int yTile, int size, Graphics graphics){
    int xpoints[] = {xTile, xTile+size/4, xTile+size*3/4, xTile+size, xTile+size*3/4, xTile+size/4};
    int ypoints[] = {(int)(yTile+Math.sqrt(3)/4*size),yTile,yTile,(int)(yTile+Math.sqrt(3)/4*size),(int)(yTile+Math.sqrt(3)/2*size),(int)(yTile+Math.sqrt(3)/2*size)};
    int npoints = 6;

    graphics.drawPolygon(xpoints, ypoints, npoints);
  }




  // Don't touch the code below
  static int WIDTH = 810;
  static int HEIGHT = 810;

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
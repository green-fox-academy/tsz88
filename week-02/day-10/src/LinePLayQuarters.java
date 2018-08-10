import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {

    //you can change the step size
    int step = 30;
    for ()

  }
  public static void greenPurplePattern(int x1, int y1, int step, int newWidth, int newHeight, Graphics graphics){
    //green lines
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < newWidth; i += step) {
      graphics.drawLine(x1,y1+i,x1+i,newHeight);
    }
    //pink lines
    graphics.setColor(Color.magenta);
    for (int i = 0; i < newHeight; i += step){
      graphics.drawLine(x1+i,y1,newWidth,y1+i);
    }
  }
  public static int[][] selectStartingPoints (int divisionNumber){
    //divisionNumber means that the canvas is split to how many parts (on each side)
    int[][] coordinates= new int[divisionNumber][2];
    //creates x coordinates
    for (int i = 0; i < divisionNumber; i+=WIDTH/divisionNumber){
      coordinates[i][0]=WIDTH/divisionNumber*i;
    }


  }
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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

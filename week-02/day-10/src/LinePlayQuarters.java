import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {

    //you can change the step size
    int step = 30;
    int divisionNumber = 2;
    //division number should be even number

    int newWidth = WIDTH / divisionNumber;
    int newHeight = HEIGHT / divisionNumber;
    int[][] current = selectStartingPoints(2);

    for (int tile = 0; tile < divisionNumber * divisionNumber; tile++) {
      greenPurplePattern(current[tile][0], current[tile][1], step, WIDTH / divisionNumber, HEIGHT / divisionNumber, graphics);
    }
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
  public static int[][] selectStartingPoints (int divisionNumber) {
    int row = 0; //row number
    int[][] coordinates = new int[divisionNumber * divisionNumber][2];
    for (int i = 0; i < divisionNumber * divisionNumber; i++) {
      for (int k = 0; k < divisionNumber; k++) {
        //coordinates in one single row
        coordinates[i][0] = k * WIDTH / divisionNumber;
        //y coordinate in a row
        coordinates[i][1] = row * HEIGHT / divisionNumber;
      }
      row++;
    }
    return coordinates;
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

import javax.swing.*;

import java.awt.*;
import java.util.concurrent.ForkJoinPool;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int x = 0;
    int y = 0;

    while (y <= HEIGHT) {
      while (x <= WIDTH) {
        if (selector(x, y)){
          lineToCenter(x,y,graphics);
        }
        x++;
      }
      x=0;
      y++;
    }

  }
  public static void lineToCenter(int x, int y, Graphics graphics){
    graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
  }

  public static Boolean selector(int x,int y){
    boolean pickMe = false;
    //it is true only in four cases:
      if ((x == 0 && y%20==0)||(x == WIDTH && y%20==0)||(x%20==0 && y == 0)||(x%20 == 0 && y == HEIGHT)){
        pickMe=true;
       }
       return pickMe;
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
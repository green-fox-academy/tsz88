import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int x=0; int y=0;

    if(y==0||y==HEIGHT) {
      while (y <= HEIGHT) {
        //this loop draws all lines from the top and the bottom side of the canvas
        while (x < WIDTH) {
          lineToCenter(x, y, graphics);
          x += 20; //20px steps between lines starting from left and right side of the canvas
        }
        y++;
      }
    }
    if(x==0||x==WIDTH) {
      for (x = 0; x<=WIDTH; x++){
        //this loop draws all lines from the sides
        while (y < HEIGHT) {
          lineToCenter(x, y, graphics);
          y += 20; //20px steps between lines starting from left and right side of the canvas
        }
      }
    }


  }
  public static void lineToCenter(int x, int y, Graphics graphics){
    graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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
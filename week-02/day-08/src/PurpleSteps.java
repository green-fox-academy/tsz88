import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps{
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    int x=0;
    int y=0;
    int squaresize = 25;
    //squaresize is not a dynamic parameter in the loop, but it is changeable if you don't like the size


    for (int i=0; i<20; i++){
      littlePurpleSquare(x,y,squaresize,graphics);
      x+=squaresize; y+=squaresize;

    }


  }
  public static void littlePurpleSquare(int x, int y, int squaresize, Graphics graphics){
    //purple color is from a similar hexadecimal, squares are fixed size
    graphics.setColor(Color.decode("#bb33ff"));
    graphics.fillRect(x,y,squaresize,squaresize);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x,y,squaresize,squaresize);
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
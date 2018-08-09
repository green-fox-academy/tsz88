import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard2 {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int size = 30;
    int x = 0;
    int i;

    //black is #000000 in hex, white is #FFFFFF
    String black = "#000000";
    String white = "#FFFFFF";

    for (int y = 0; y < HEIGHT; y += size) {

      if (y%(size*2) == 0) {
        while (x < WIDTH) {
          //start even number rows with black
          layingATile(size, black, x, y, graphics);
          x += size;
          layingATile(size, white, x, y, graphics);
          x += size;
        }
      }

      else{
        while (x < WIDTH) {
          //start even number rows with white
          layingATile(size, white, x, y, graphics);
          x += size;
          layingATile(size, black, x, y, graphics);
          x += size;
        }
      }
      x=0;
    }
  }

  public static void layingATile (int size, String color, int x, int y, Graphics graphics){
    graphics.setColor(Color.decode(color));
    graphics.fillRect(x,y,size,size);
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

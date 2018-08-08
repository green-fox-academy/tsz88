import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int tileSize = 15;
    int rowNumber = 1;
    int x = 0; int y =0;

    for (int i=0;y<HEIGHT; i++){
      if (rowNumber%2==1){
        while(x<WIDTH){
          blackTile(x,y,tileSize,graphics);
          x
        }



      }
    }



  }

  public static void blackTile(int x, int y, int tileSize, Graphics graphics){
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x,y,tileSize,tileSize);
  }
  public static void whiteTile(int x, int y, int tileSize, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(x, y, tileSize, tileSize);
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
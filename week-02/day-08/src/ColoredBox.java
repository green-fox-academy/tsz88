import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    //top
    graphics.setColor(Color.BLACK);
    graphics.drawLine(50,30,250,30);

    //rightside
    graphics.setColor(new Color(200, 63, 72));
    graphics.drawLine(250,30,250,230);

    //leftside
    graphics.setColor(new Color(168, 84,200));
    graphics.drawLine(50,30,50,230);

    //bottom
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(50,230,250,230);
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
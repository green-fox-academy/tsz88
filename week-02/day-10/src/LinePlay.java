import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    //you can change the step size
    int step = 30;
    //green lines
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < WIDTH; i += step) {
      graphics.drawLine(0,i,i,HEIGHT);
    }
    //pink lines
    graphics.setColor(Color.magenta);
    for (int i = 0; i < HEIGHT; i += step){
      graphics.drawLine(i,0,WIDTH,i);
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
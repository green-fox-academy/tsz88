package com.greenfoxacademy;

    import sun.java2d.windows.GDIRenderer;

    import javax.swing.*;

    import java.awt.*;

    import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveGraphic1var {
  public static void mainDraw(Graphics graphics) {
    fractal(0,0,WIDTH,graphics);
  }

  public static void fractal(int x, int y, int size, Graphics graphics) {
    if (size < 9) {
    } else {
      graphics.drawRect(x,y,size,size);
      fractal(x+size/3,y,size/3,graphics);
      fractal(x,y+size/3, size/3, graphics);
      fractal(x+size/3,y+size*2/3, size/3, graphics);
      fractal(x+size*2/3, y+size/3, size/3, graphics);
    }
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
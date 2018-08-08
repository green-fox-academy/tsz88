import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles{

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.

    for (int i=0;i<4;i++){
      int r = (int)(Math.random() * 256);
      int g =(int)(Math.random() * 256);
      int b = (int)(Math.random() * 256);
      graphics.setColor(new Color(r,g,b));
      int x = (int)(Math.random()*WIDTH);
      int y = (int)(Math.random()*HEIGHT);

      int length1 = (int)(Math.random()*(WIDTH-x));
      int length2 = (int)(Math.random()*(HEIGHT-y));

      graphics.drawRect(x,y,length1,length2);}

  }


  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
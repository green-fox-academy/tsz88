import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    String specColor;
    int size=HEIGHT;

    ArrayList<String> rainbowColors =new ArrayList<>(Arrays.asList("#9400D3","#4B0082","#0000FF","#00FF00","#FFFF00","#FF7F00","#FF0000"));

    while(size>0){
      int i= (int)(Math.random()*rainbowColors.size());
      //i is the index of the element randomly selected from rainbowColors arraylist
      specColor= rainbowColors.get(i);

      coloredSquares(size,specColor,graphics);
      size-=2;
    }



  }
  public static void coloredSquares (int size, String specColor, Graphics graphics){

    Color current = (Color.decode(specColor));
    graphics.setColor(current);
    graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2,size,size);
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

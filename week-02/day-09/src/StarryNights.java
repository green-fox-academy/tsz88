import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNights {

  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    String color;


    //grey colors from hexadecimal codes
    ArrayList<String> greyColorArray = new ArrayList<>(Arrays.asList("#424242","#6b6b6b","#767676","#848484","#939393","#a3a3a3","#bcbcbc","#d6d6d6","#efefef"));

    //could not find background color setting, drawing just a big black rectangle instead
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,WIDTH,HEIGHT);

    for (int i=0; i<70; i++){
      color = greyColorArray.get((int)(Math.random()*greyColorArray.size()));
      starHere((int)(Math.random()*WIDTH),(int)(Math.random()*HEIGHT),color,graphics);
    }


  }
  public static void starHere(int x, int y, String color, Graphics graphics){
    graphics.setColor(Color.decode(color));
    graphics.fillRect(x,y,5,5);
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
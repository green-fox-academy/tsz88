import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){
    int step = 20;
    //create array that holds all the center point in the middle, vertical axis
    int[][] verticalCenterPoints = new int[HEIGHT/step+1][2];
    for (int i = 0; i <= HEIGHT/step; i++){
      verticalCenterPoints[i][0] = WIDTH/2;
      verticalCenterPoints[i][1] = i*step;
    }

    //create array that holds all the center point in the middle, horizontal axis
    int[][] horizontalCenterPoints = new int[WIDTH/step+1][2];
    for (int k = 0; k <= WIDTH/step; k++){
      horizontalCenterPoints[k][0] = k*step;
      horizontalCenterPoints[k][1] = HEIGHT/2;
    }
//    for (int l = 0; l < horizontalCenterPoints.length; l++){
//      for (int m = 0; m < 2; m++) {
//        System.out.print(horizontalCenterPoints[l][m]);
//      }
//      System.out.println();
//    }
    graphics.setColor(Color.BLACK);
    int m = WIDTH/step/2; //x value of the central point on the horizontal axis

    System.out.println(verticalCenterPoints.length+ " & "+horizontalCenterPoints.length);
    //connect the vertical axis with every horizontal dot on the left side
    for (int v = 0; v <= HEIGHT/step; v++){
        if (v <= m){
          graphics.drawLine(verticalCenterPoints[v][0],verticalCenterPoints[v][1],horizontalCenterPoints[v+m][0],horizontalCenterPoints[v+m][1]);
          graphics.drawLine(verticalCenterPoints[v][0],verticalCenterPoints[v][1],horizontalCenterPoints[m-v][0],horizontalCenterPoints[m-v][1]);
       }
       if (v > m){
         graphics.drawLine(verticalCenterPoints[v][0],verticalCenterPoints[v][1],horizontalCenterPoints[v-m][0],horizontalCenterPoints[v-m][1]);
         graphics.drawLine(verticalCenterPoints[v][0],verticalCenterPoints[v][1],horizontalCenterPoints[WIDTH/step-v+m][0],horizontalCenterPoints[WIDTH/step-v+m][1]);
       }
    }
    }






  //    Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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
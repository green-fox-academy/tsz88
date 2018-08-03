import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args){

    int row;
    String line = "*";
    String space = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give me the size for the pyramid, please!");
    row = scanner.nextInt();

    for (int i = 1; i <= row; i++){
      int s = row-i;
      while (s>0){
        //makes a string with enough spaces
        space = space + " ";
        s--;
      }
      System.out.println(space+line);
      line = line + "**";
      //space string resets in each cycle
      space = "";
    }
  }
}

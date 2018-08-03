import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args){

    int row;
    String line = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give me the size for the triangle, please!");
    row = scanner.nextInt();

    for (int i = 0; i<=row; ++i){
      System.out.println(line);
      line = line + "*";
    }
  }
}

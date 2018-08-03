import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class DrawDiagonal {
  public static void main(String[] args){

    int row;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number greater than 3, please! This will be the number of rows.");
    row = scanner.nextInt();


      String firstLine = "";


      //prints first line
      for (int i = row; i>0; i--){
        firstLine = firstLine + "X";
      }
      System.out.println(firstLine);

      //print interim rows
      for (int i=1; i<=row-2; i++){
        String before = "";
        String after = "";
        //i is the ordinal (sorszamnev) of the current interim row
        //b is the number of before spaces needed in that interim row
        int b = i-1;
        //creates before space string
        while (b > 0){
          before = before + " ";
          b--;
        }
        b = i-1;

        //creates after space string, a is the length of after space string
        for(int a = row-3-b; a>0;a--){
          after = after + " ";
        }
        System.out.println("X"+before+"X"+after+"X");
      }
    //prints last line

    System.out.println(firstLine);


  }
}

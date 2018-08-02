import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args){

    System.out.println("Give me a whole number, please!");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    for (int i=1; i<=10; i++) {
      System.out.println(i+" * "+a+" = "+i*a);
    }

  }
}

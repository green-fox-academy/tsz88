import java.util.Scanner;

public class PrintBigger {
  // Write a program that asks for two numbers and prints the bigger one
  public static void main(String[] args){

    System.out.println("Give me a number, please!");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();

    System.out.println("Give me another number, please!");
    double b = scanner.nextDouble();

    if (a < b) {
      System.out.println(b + " is bigger out of these two.");
    }
    if (a > b) {
      System.out.println(a + " is bigger out of these two.");
    }






  }
}

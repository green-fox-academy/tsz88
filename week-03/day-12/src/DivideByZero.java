import java.util.Scanner;

public class DivideByZero {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What number would you use as the denominator of 10?");
    int denominator = scanner.nextInt();

    try{
      int result = 10/denominator;
      System.out.println(result);
    } catch (ArithmeticException e){
      System.out.println("We do not divide by zero around here!");
    }
  }
}

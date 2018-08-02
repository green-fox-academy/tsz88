import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {

    System.out.println("Tell me a whole number, please!");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    if ((number %=2) == 0) {
      System.out.println("This number is even.");
    } else {
      System.out.println("This number is odd.");
    }
  }
}

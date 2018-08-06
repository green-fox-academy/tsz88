import java.util.Scanner;

public class Sum {
  // - Write a function called `sum` that sum all the numbers
  //   until the given parameter and returns with an integer

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Until which number should I perform sum?");
    int untilWhichNumber = scanner.nextInt();
    System.out.println(sum(untilWhichNumber));
  }

  public static int sum(int endpoint) {
    int partialSum = 0;
    for (int i = endpoint; i > 0; i--) {
      partialSum +=i;
    }
  return partialSum;
  }
}

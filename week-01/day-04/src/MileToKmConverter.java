import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    System.out.println("Tell me a distance in kilometers (in whole numbers), please!");
    Scanner scanner = new Scanner(System.in);
    int distanceKm = scanner.nextInt();

    // 1 km is 0.621371192 miles.

    double distanceMile = distanceKm * 0.621371192;

    System.out.println("This is exactly " + distanceMile + " in miles.");


  }
}

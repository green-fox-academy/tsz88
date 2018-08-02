public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int remainingSeconds;

    remainingSeconds = (24*60*60)-(currentSeconds + currentMinutes*60 + currentHours*3600);

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    System.out.println("Remaining seconds in the day: " +remainingSeconds);
  }
}

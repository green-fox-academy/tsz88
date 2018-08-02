public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int hour = 17 * 5 * 6;
    System.out.println(hour);
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double percentage = hour*100/(52*17);
    System.out.println(percentage + "% of working hours are coding hours.");
  }


}

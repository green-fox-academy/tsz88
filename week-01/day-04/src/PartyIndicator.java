import java.util.Scanner;

public class PartyIndicator {
  public static void main (String[] args){

    System.out.println("How many girls are coming to the part?");
    Scanner scanner = new Scanner(System.in);
    int girls = scanner.nextInt();

    System.out.println("And how many boys are coming?");
    int boys = scanner.nextInt();

        if ((girls == boys) && (girls+boys >= 20)) {
          System.out.println("The party is excellent!");
        }

        if ((girls != boys) && (girls+boys >= 20)) {
          System.out.println("Quite cool party!");
        }

        if (girls+boys < 20) {
          System.out.println("Average party...");
        }

        if (girls == 0) {
          System.out.println("Sausage party");
        }



  }
}

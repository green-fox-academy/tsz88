import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args){
    //explain the game to the user
    System.out.println("Guess the number I am thinking of and I'll tell you if you are right.");

    //here you can modify the mystery number, careful! it should not be the same as the first guess!
    int mysteryNumber = 8;
    int guessedNumber = 0;
    while (mysteryNumber != guessedNumber){
      Scanner scanner = new Scanner(System.in);
      guessedNumber = scanner.nextInt();
       if (guessedNumber < mysteryNumber){
         System.out.println("The stored number is higher. Guess again!");
       }
       if (guessedNumber > mysteryNumber){
         System.out.println("The stored number is lower. Guess again!");
       }
    }

    System.out.println("You found the number: "+mysteryNumber);





  }
}

import java.util.Scanner;

public class PalindromBuilder {
  public static void main(String[] args){
    //take a string, create a palindrome from it and then return it

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a word to palindromise:");
    String word = scanner.nextLine();

    for (int i = word.length(); i > 0; i--){
      word = word + word.charAt(i-1);
    }
    System.out.println(word);
  }
}

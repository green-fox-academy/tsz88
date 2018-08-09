import java.util.Scanner;

public class SubString {
  public static void main(String[] args){
    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me the text where we are searching:");
    String text = scanner.nextLine();
    System.out.println("Please, give me the word(s) we are searching for:");
    String keyword = scanner.nextLine();

    System.out.println(startingPlace(text,keyword));

  }
  public static int startingPlace(String text, String keyword){
    int out;
    if (text.contains(keyword)){
      out = text.indexOf(keyword);
    }
    else {
      out = -1;
    }
    return out;
  }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  //Create a function named is anagram following your current language's style guide.
  // It should take two strings and return a boolean value depending on whether its an
  // anagram or not.


  public static void main(String[] args) {
    System.out.println("Give me the first arrangement of your anagram, please!");
    Scanner scanner = new Scanner(System.in);
    String str1 = scanner.nextLine();
    System.out.println("Give me the first arrangement of your anagram, please!");
    String str2 = scanner.nextLine();

    if (reallyAnagram(str1, str2)) {
      System.out.println("They really are anagrams.");
    } else {
      System.out.println("They are not anagrams.");
    }

  }

  public static Boolean reallyAnagram(String a, String b) {
    ArrayList<String> firstAL = new ArrayList<>(Arrays.asList(a.split("")));
    ArrayList<String> secondAL = new ArrayList<>(Arrays.asList(b.split("")));

    Boolean output = false;
    //test if they are the same length, otherwise send for quit
    if (a.length() == b.length()) {
      for (int i = 0; i < a.length(); i++) {
        //test second arraylist element by element if it is present in the first
        if (firstAL.contains(secondAL.get(i))) {
          //if present, it removes that letter from the first
          firstAL.remove(secondAL.get(i));
        }
        if (firstAL.isEmpty()) {
          output = true;
          //if all letters eliminated, then they were the same
        }
      }

    } else {
      output = false;
    }
    return output;
  }
}

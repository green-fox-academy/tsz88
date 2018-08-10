import java.util.ArrayList;
import java.util.Scanner;

public class PalindromSearcher2 {
  public static void main(String[] args){
    //should take a string, search for palindromes
    // that at least 3 characters long and return a list with the found palindromes.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me the word(s) that we are scanning for palindromes:");
    String text = scanner.nextLine();

    ArrayList<String> palindromSequences = new ArrayList<>();

    for (int a = 0; a < text.length() - 2; a++){
      for (int z = a + 3; z <= text.length(); z++){
        if (isItAPalindrom(text.substring(a,z))){
          palindromSequences.add(text.substring(a,z));
        }
      }
    }

    System.out.println(palindromSequences);

  }
  public static boolean isItAPalindrom(String substring) {
    String substringBackwords = "";
    for (int i = substring.length(); i > 0; i--) {
      substringBackwords = substringBackwords + substring.charAt(i-1);
    }
    boolean aaa = substring.equalsIgnoreCase(substringBackwords);
    return aaa;
  }
}

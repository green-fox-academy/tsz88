import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }
  public static String quoteSwap(List<String> input){
    int doIsHere = input.indexOf("do");
    int cannotIsHere = input.indexOf("cannot");
    String temp;

    //saves the value of do to a temp string
    temp = input.get(doIsHere);
    //overwrites do with cannot, and cannot with temp
    input.set(doIsHere,input.get(cannotIsHere));
    input.set(cannotIsHere,temp);

      String output="";

      for (int i=0;i<input.size()-1;i++){
        output+=input.get(i)+" ";
      }
      output+=input.get(input.size()-1);
   return output;
  }
}

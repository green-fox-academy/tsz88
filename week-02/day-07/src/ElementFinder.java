import java.util.*;

public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsFive(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

  }
  public static String containsSeven(ArrayList<Integer> input){
    String output;
    if (input.contains(7)){
      output="Hoorray";
    } else {
      output="Noooooo";
    }
  return output;}

  public static String containsFive(ArrayList<Integer> guessWhat){
    String answer="Noooooo";
    for (int i=0;i<guessWhat.size();i++){
      if (guessWhat.get(i).equals(5)){
        answer = "Hoorray";
      }
    }
    return answer;
  }
}

import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> a, ArrayList<String> b) {
    ArrayList<String> couples = new ArrayList<>();
    //select the shorter ArrayList and save its length
    int shorter;
    if (a.size() < b.size()) {
      shorter = a.size();
    } else shorter = b.size();

    //one from girls, on from boys added to couples string
    for (int i = 0; i < shorter; i++) {

      couples.add(a.get(i));
      couples.add(b.get(i));
    }
    return couples;
  }

}


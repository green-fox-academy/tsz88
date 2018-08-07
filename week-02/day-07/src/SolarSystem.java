import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.

    System.out.println(putSaturn(planetList));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
  }
  public static ArrayList putSaturn(ArrayList<String> input){
    input.add ("Saturn");
      return input;
  }

}

//earlier version, also works but too long and complicated
    // public static ArrayList putSaturn(ArrayList planetList){
      // ArrayList <String> planetListExtended = new ArrayList<>();
      //planetListExtended.addAll(planetList);
      //planetListExtended.add("Saturn");
  //  return planetListExtended;
  //}

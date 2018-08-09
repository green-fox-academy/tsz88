import java.util.ArrayList;
import java.util.List;

public class CandyShop {
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }
  public static List<Object> sweets(ArrayList<Object> input){
    for (int i=0;i<input.size();i++){
      if (input.get(i).equals(2)){
        input.set(i,"Croissant");
      }
      if (input.get(i).equals(false)){
        input.set(i,"Ice cream");
      }
    }
    return input;
  }
}
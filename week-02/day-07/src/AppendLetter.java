import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

  // The output should be: "boa", "anaconda", "koala", "panda", "zebra"
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }
  public static List<String> appendA(List<String> input){
    ArrayList<String> extended = new ArrayList<>();
    for (int i=0;i<input.size();i++){
      extended.add(input.get(i)+"a");
    }
  return extended;
  }
}

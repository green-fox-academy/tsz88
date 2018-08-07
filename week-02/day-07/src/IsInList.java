import java.util.*;

public class IsInList{
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    checkNums(list);
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

    System.out.println(checkNums(list));
  }
  public static Boolean checkNums(ArrayList<Integer> input) {
    //I compare an array with control values with the input arraylist
    Integer[] control = {4, 8, 12, 16};
    Boolean containsItAll = true;
    //the output is only false if there is a control array element not present in input

    for (int j = 0; j < control.length; j++) {
      for (int i = 0; i < input.size(); i++) {
        if (input.get(i).equals(control[j])) {
        } else {
          containsItAll = false;
        }
      }
    }
    return containsItAll;
  }
}

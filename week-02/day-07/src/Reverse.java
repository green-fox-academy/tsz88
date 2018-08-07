public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(reversed));
  }
  public static String reverse(String input){
    //coolArray is the split letters from original String, returnArray the reversed order
    //but still array, and output is the re-merged new String

    String[] coolArray = input.split("");
    String[] returnArray = new String[coolArray.length];
    int k = 0;
    String output = "";

    for (int i = coolArray.length-1; i>=0;i--){
      returnArray[k]=coolArray[i];
      k++;
    }
    for (int i=0; i<returnArray.length; i++){
      output = output+returnArray[i];
    }
    return output;
  }
}

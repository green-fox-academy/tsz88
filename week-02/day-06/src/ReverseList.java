import java.util.Arrays;

public class ReverseList {

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};
    int[] temp = new int[aj.length];

//I create an exact copy of the original array
    for (int i=0;i<aj.length;i++){
          temp[i]=aj[i];
    }
//reassign elements of original array
    for (int k=0; k<aj.length; k++){
      aj[k]=temp[(aj.length-k-1)];
    }

    System.out.println(Arrays.toString(aj));
  }
}

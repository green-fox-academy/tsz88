public class SumAllAlternative {
// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

  public static void main(String[] args){
    int[] ai={3,4,5,6,7};

    System.out.println(sum(ai));
  }

//this code uses a pretty function instead of the original :-)

  public static int sum(int array[]){
    int sum =0;
    for (int i=0;i<array.length;i++){
      sum+=array[i];
    }
    return sum;
  }
}
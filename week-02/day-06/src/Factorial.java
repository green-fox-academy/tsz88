public class Factorial{
  public static void main(String[] args){
    System.out.println(factorio(6));
  }
  public static int factorio(int endpoint){
    int x = 1;
    for (int i=endpoint; i>0;i--){
      x *= i;
    }
  return x;}

}
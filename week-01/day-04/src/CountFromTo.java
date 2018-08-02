import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a whole number, please!");
    int a = scanner.nextInt();

    System.out.println("Give me another, bigger whole number please!");
    int b = scanner.nextInt();

    if (b <= a){
      System.out.println("The second number should be bigger.");
    }

    for (int i=a; i<b; i++){
      System.out.println(i);
    }
  }
}

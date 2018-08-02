public class FizzBuzz {
  public static void main(String[] args) {
    boolean div3;
    boolean div5;

    for (int i = 1; i <= 100; i++) {
      div3 = i % 3 == 0;
      div5 = i % 5 == 0;

      if (div3 && !div5) {
        System.out.println("Fizz");
      }
      if (!div3 && div5) {
        System.out.println("Buzz");
      }
      if (div3 && div5) {
        System.out.println("FizzBuzz");
      }
      if (!div3&&!div5){
        System.out.println(i);
      }
    }
  }
}




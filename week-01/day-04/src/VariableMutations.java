public class VariableMutations {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
    a = a + 10;

    System.out.println(a);




    int b = 100;
    // make it smaller by 7
    b = b - 7;

    System.out.println(b);




    int c = 44;
    // please double c's value
    c = c * 2;

    System.out.println(c);




    int d = 125;
    // please divide by 5 d's value

    d = d / 5;
    System.out.println(d);




    int e = 8;
    // please cube of e's value
    e = e * e;

    System.out.println(e);




    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)

    boolean f1nagyobb = f1 > f2;
    System.out.println("Is f1 bigger? " + f1nagyobb);

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)

    boolean g2nagyobb = (2 * g2) > g1;
    System.out.println("Double g2 is bigger? " + g2nagyobb);


    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
    boolean divisor11 = h % 11 == 0;
    System.out.println("Is 11 a divisor? " + divisor11);


    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

    boolean i1logic = (i1 > (i2*i2)) && (i1 < (i2*i2*i2));
    System.out.println("Is i1 bigger than the square and smaller than the cube? " +i1logic);


    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean div3or5 = (j % 3 == 0) || (j % 5 == 0);
    System.out.println("J is dividable by 3 or 5? " + div3or5);


    String k = "Apple";
    //fill the k variable with its conent 4 times
    k = k+k+k+k;

    System.out.println(k);
  }
}

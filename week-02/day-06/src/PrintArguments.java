public class PrintArguments {

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
  public static void main(String[] args){

  printParams("first","second","third","fourth","fifth");

  }
  public static void printParams(String... a){
    String together = "";
    for (int i=0;i<a.length;i++){
          together += a[i]+" ";
    }
    System.out.println(together);
  }
}
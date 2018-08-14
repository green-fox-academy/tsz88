import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args){
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.

    //parameters' input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, tell me the file path:");
    String path = scanner.nextLine();
    System.out.println("Please, tell me which words to add to this file:");
    String word = scanner.nextLine();
    System.out.println("Please, tell me how many times I should add the words:");
    int repeats = scanner.nextInt();

    Path address = Paths.get(path);

    ArrayList<String> text = new ArrayList<>();
    for (int i = 0; i < repeats; i++){
      text.add(i,word);
    }

    try {
      Files.write(address,text);
    } catch (IOException ex){
    }
  }
}

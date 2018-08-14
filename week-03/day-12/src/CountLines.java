import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args){
    System.out.println("Tell me the filename, please!");
    Scanner scanner = new Scanner(System.in);
    String filename = scanner.nextLine();
    Path path = Paths.get(filename);

    try{
      int fileLinesNumber = Files.readAllLines(path).size();
      System.out.println(fileLinesNumber);
    } catch (IOException x){
      System.out.println(0);
    }

  }
}

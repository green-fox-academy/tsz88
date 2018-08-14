import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Which file should I copy? (Without the .txt at the end.");
    String fromName = scanner.nextLine();
    System.out.println("What should be the name of the copied file?");
    String toName = scanner.nextLine();

    Path originalPath = Paths.get(fromName+".txt");
    Path copiedPath = Paths.get(toName+".txt");

    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(originalPath);
      Files.write(copiedPath,content);
      System.out.println(Files.exists(copiedPath));
    } catch (IOException x) {
    }
  }
}

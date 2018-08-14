import java.io.BufferedWriter;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.nio.channels.WritePendingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args){

    Path path = Paths.get("my-file.txt");
    //BufferedWriter bw = new BufferedWriter("my-file.txt");

    try {
  //    bw.write("Szilvi");
      Files.write(path,"Szilvi\n".getBytes());
    } catch (WriteAbortedException y){
      System.out.println("Unable to write file: my-file.txt");
    } catch (IOException x){
      System.out.println("");
    }
    try {
      List<String> lines = null;
      lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (IOException x){
      System.out.println("no good");
    }
  }
}

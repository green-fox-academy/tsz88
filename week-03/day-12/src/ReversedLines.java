import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args){
    Path x = Paths.get("reversed-lines.txt");
    List<String> in = new ArrayList<>();
    ArrayList<String> out = new ArrayList<>();

    try {
      in = Files.readAllLines(x);
      String s = "";
      for (int i = 0; i < in.size(); i++){
        s = "";
        for (int k = in.get(i).length()-1; k >= 0; k--){
          s = s + in.get(i).charAt(k);
        }
        out.add(i,s);
      }
    } catch (IOException c){}

    for (int i = 0; i < out.size(); i++){
      System.out.println(out.get(i));
    }
  }
}

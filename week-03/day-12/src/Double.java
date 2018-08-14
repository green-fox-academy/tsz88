import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Double {
  public static void main(String[] args){
    Path in = Paths.get("duplicated-chars.txt");
    List<String> content = new ArrayList<>();
    ArrayList<String> out = new ArrayList<>();
    try {
      content = Files.readAllLines(in);

      for (int i = 0; i < content.size(); i++){
        String s = "";
        for (int x = 0; x < content.get(i).length(); x+=2){
          s = s + content.get(i).substring(x,x+1);
        }
        out.add(s);
      }
      int k = 0;
      while (k < out.size()){
        System.out.println(out.get(k));
        k++;
      }

    } catch (IOException x){
    }
  }
}

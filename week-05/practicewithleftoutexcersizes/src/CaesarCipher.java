import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CaesarCipher {

  public void encryptTheCode(){
    Path path = Paths.get("caesar.txt");
    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    } catch (IOException x){
    }
  }
}

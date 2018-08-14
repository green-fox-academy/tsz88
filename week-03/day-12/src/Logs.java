import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logs {


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

  public static void main(String[] args){
    List<String> inputArrayList = new ArrayList<>();
    Path path = Paths.get("log.txt");
    List<String> output = new ArrayList<>();

    try {
      inputArrayList = Files.readAllLines(path);
      Pattern IPAddress = Pattern.compile("https://*.com");
      String substring;
      for (int i = 0; i < inputArrayList.size(); i++){
        Matcher m = IPAddress.matcher(inputArrayList.get(i));
      }

    } catch (IOException x){
      System.out.println("File not readable.");
    }


  }
}

import com.greenfox.LetterCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class LetterCounterTest {



  @Test
  public void oneLetterRepeatedAsInput(){
    LetterCounter example = new LetterCounter("xxxxx");
    HashMap awesome = new HashMap<String, Integer>();
    awesome.put("x",5);
    Assert.assertEquals(awesome, example.countThem());
  }

  @Test
  public void variousLetterInput(){
    LetterCounter example = new LetterCounter("baba");
    HashMap awesome = new HashMap<String, Integer>();
    awesome.put("a",2);
    awesome.put("b",2);
    Assert.assertEquals(awesome, example.countThem());
  }

}

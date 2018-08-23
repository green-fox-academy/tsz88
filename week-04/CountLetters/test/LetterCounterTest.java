import com.greenfox.LetterCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class LetterCounterTest {



  @Test
  public void oneLetterRepeatedAsInput(){
    LetterCounter example = new LetterCounter("xxxxx");
    HashMap awesome = new HashMap<String, int>();
    awesome.put("x",5);
    Assert.assertEquals(awesome, example.countThem());
  }

}

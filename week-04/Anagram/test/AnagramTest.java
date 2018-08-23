import com.greenfox.Anagram;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

  Anagram a = new Anagram();

  @Test
  public void nonAnagramsNonevenLength(){
    String x = "nem";
    String y = "anagramma";
    Assert.assertEquals(false, a.ifAnagrams(x,y));
  }

  @Test
  public void nonAnagramsDifferentLetters(){
    String x = "adada";
    String y = "dadad";
    Assert.assertEquals(false,a.ifAnagrams(x,y));
  }

  @Test
  public void anagramsForReal(){
    String x = "realfun";
    String y = "funeral";
    Assert.assertEquals(true,a.ifAnagrams(x,y));
  }
}

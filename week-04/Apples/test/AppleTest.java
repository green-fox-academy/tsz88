import com.greenfox.Apple;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest {

  Apple a = new Apple();

  @Test
  public void appleGetWorks(){
    Assert.assertEquals("apples", a.getApple());
  }

}

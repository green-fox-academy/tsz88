

import com.greenfox.Sum;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {

  Sum x = new Sum();

  @Test
  //tests with multiple elements in ArrayList
  public void sumMakerTest() {
    ArrayList<Integer> tester = new ArrayList<>(Arrays.asList(3, 6, 9, 12));
    Assert.assertEquals(30, x.sumMaker(tester));
  }

  @Test
  public void emptyStarterForSum() {
    ArrayList<Integer> q = new ArrayList<>();
    Assert.assertEquals(0, x.sumMaker(q));
  }

  @Test
  public void singleStarterForSum() {
    ArrayList<Integer> q = new ArrayList<>(Arrays.asList(4));
    Assert.assertEquals(4, x.sumMaker(q));
  }

  @Test
  public void nullStarterForSum() {
    ArrayList<Integer> q = new ArrayList<>(Arrays.asList(null));
    Assert.assertEquals(0, x.sumMaker(q));
  }

}

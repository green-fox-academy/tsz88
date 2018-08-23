

import com.greenfox.Sum;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {

Sum x = new Sum();

@Test
public void sumMakerTest(){
  ArrayList<Integer> tester = new ArrayList<>(Arrays.asList(3,6,9,12));
  Assert.assertEquals(30, x.sumMaker(tester));
}
}

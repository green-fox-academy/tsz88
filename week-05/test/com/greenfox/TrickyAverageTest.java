package com.greenfox;



import org.junit.Assert;
import org.junit.Test;

public class TrickyAverageTest {

  @Test
  public void getTrickyAvgTest1() {
    int[] example = {1, 2, 3, 4, 5, 6, 7, 8};
    Assert.assertEquals(4.5,TrickyAverage.getTrickyAvg(example),0.1);
  }

  @Test
  public void getTrickyAvgTest2() {
    int[] example = {3, 3, 3, 3, 3};
    Assert.assertEquals(1.5,TrickyAverage.getTrickyAvg(example),0.1);
  }

  @Test
  public void getTrickyAvgTest3() {
    int[] example = {1, 3, 5, 7};
    Assert.assertEquals(0.5,TrickyAverage.getTrickyAvg(example),0.1);
  }
}

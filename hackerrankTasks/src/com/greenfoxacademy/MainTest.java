package com.greenfoxacademy;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {


  @Test
  public void birthdayCakeCandles() {
    int[] testCandles = {3,2,1,3,3,3,5};
    int result = Main.birthdayCakeCandles(testCandles);
    Assert.assertEquals(1,result);
  }

  @Test
  public void timeFormatMethod() throws ParseException {
    String example = "07:05:45PM";
    Assert.assertEquals("19:05:45", Main.timeConversion(example));
  }

  @Test
  public void crazyGraphEvenTree(){
    int nodes = 10;
    int edges = 9;
    List<Integer> fromList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
    List<Integer> toList = new ArrayList<>(Arrays.asList(1, 1, 3, 2, 1, 2, 6, 8, 8));

    Assert.assertEquals(2, Main.evenForest(nodes, edges, fromList, toList));
  }

  @Test
  public void printerTest(){
    int N = 18;
    Assert.assertEquals("Weird", Main.printer(N));
  }
}

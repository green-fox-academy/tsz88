package com.greenfoxacademy;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

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
}

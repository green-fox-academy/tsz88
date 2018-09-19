package com.example.printer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilityServiceTest {

  @Test
  public void encodeCeasarCodeTest() {
    Assert.assertEquals("bCd",UtilityService.encodeCeasarCode(1,"aBc"));
  }
}
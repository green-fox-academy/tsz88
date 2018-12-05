package com.greenfoxacademy;

import org.junit.Assert;
import org.junit.Test;

public class AircraftTest {

  @Test
  public void emptyJetTryingToFight() {
    JetF35 jet = new JetF35();
    int actual = jet.fight();
    Assert.assertEquals(0, actual);
  }

  @Test
  public void testingDamageCalculationPrecisionWithF35(){
    JetF35 jet = new JetF35();
    jet.refill(10);
    int actualDamage = jet.fight();
    Assert.assertEquals(500, actualDamage);
  }

  @Test
  public void testDamageCalculationPrecisionWithF16(){
    JetF16 jet = new JetF16();
    jet.refill(10);
    int actualDamage = jet.fight();
    Assert.assertEquals(300, actualDamage);
  }

  @Test
  public void refillNormally() {
    JetF16 jet = new JetF16();
    int actual = jet.refill(1000);
    Assert.assertEquals(992, actual);
  }

  @Test
  public void refillScarceResources(){
    JetF35 jet = new JetF35();
    int actual = jet.refill(11);
    Assert.assertTrue(jet.currentAmmo == 11);
    Assert.assertTrue(actual == 0);
  }

  @Test
  public void refillWithZero(){
    JetF35 jet = new JetF35();
    int actual = jet.refill(0);
    Assert.assertTrue(jet.currentAmmo == 0);
    Assert.assertTrue(actual == 0);
  }

  @Test
  public void getType() {
  }

  @Test
  public void getStatus() {
  }
}

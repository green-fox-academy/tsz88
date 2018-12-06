
import com.greenfoxacademy.JetF16;
import com.greenfoxacademy.JetF35;
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
    int leftOverAmmo = jet.refill(10);
    int actualDamage = jet.fight();
    Assert.assertEquals(240, actualDamage);
    Assert.assertTrue(leftOverAmmo == 2);
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
    Assert.assertTrue(jet.getCurrentAmmo() == 11);
    Assert.assertTrue(actual == 0);
  }

  @Test
  public void refillWithZero(){
    JetF35 jet = new JetF35();
    int actual = jet.refill(0);
    Assert.assertTrue(jet.getCurrentAmmo() == 0);
    Assert.assertTrue(actual == 0);
  }

  @Test
  public void getType() {
  }

  @Test
  public void getStatusF16() {
    JetF16 x = new JetF16();
    x.refill(8);
    StringBuffer actualStatus = new StringBuffer();
    actualStatus.append("Type: " + "F16" + ", ");
    actualStatus.append("Ammo: " + 8 + ", ");
    actualStatus.append("Base Damage: " + 30 + ", ");
    actualStatus.append("All Damage: " + 30 * 8);
    String endproduct = actualStatus.toString();
    System.out.println(endproduct);
    Assert.assertEquals(endproduct, x.getStatus());
  }
}

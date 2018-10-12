package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {
//  WebDriver dr;

  @When("^I navigate to the site$")
  public void iNavigateToTheSite() throws Throwable {
//    dr = new FirefoxDriver();
//    dr.get("http://todomvc.com/examples/vanillajs/");
    System.out.println(1);
  }

  @Then("^I should see \"([^\"]*)\" written on the main page$")
  public void iShouldSeeWrittenOnTheMainPage(String arg0) throws Throwable {
//    String expectedContent = "todos";
//    try {
//    String actualContent = dr.findElement(By.xpath("//todos")).toString();
//    } catch (Exception exception){
//      System.out.println("Element not found with xpath.");
//    }
    System.out.println(2);
  }
}

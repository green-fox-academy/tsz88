import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TodoStepDefs {
  @When("^user is on main site$")
  public void userIsOnMainSite() throws Throwable {
    System.out.println("user got to main site");
  }

  @Then("^user is able to see main site$")
  public void userIsAbleToSeeMainSite() throws Throwable {
    System.out.println("user can see main site");
  }
}

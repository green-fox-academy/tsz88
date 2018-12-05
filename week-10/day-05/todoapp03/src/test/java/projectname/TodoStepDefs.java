package projectname;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoStepDefs {
  WebDriver driver;

  @When("^user is on main site$")
  public void userIsOnMainSite() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\testautomation\\WebDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://todomvc.com/examples/vanillajs/");
  }

  @Then("^user is able to see main site$")
  public void userIsAbleToSeeMainSite() throws Throwable {
    driver.findElement(By.className("new-todo"));
  }
}

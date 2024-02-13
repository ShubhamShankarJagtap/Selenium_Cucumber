package stepdefinition;

import PageObject.LoginPage;
import Utility.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Login extends BaseClass {

   public WebDriver driver;
    public LoginPage loginPage;

    @Given("I launch the {string} browser.")
    public void iLaunchTheBrowser(String browser) {

        launchBrowser(browser);
        this.driver = super.driver;
        loginPage = new LoginPage(driver);
    }

    @When("I enter the url {string}")
    public void iEnterTheUrl(String url) {

        System.out.println(driver);
        driver.get(url);
        getScreenShot();
    }

    @Then("page title should be {string}")
    public void pageTitleShouldBe(String expectedPageTitle) {

        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

    @And("I enter the email as {string}")
    public void iEnterTheEmailAs(String email) {

        loginPage.enterEmail(email);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String passWord) {

        loginPage.enterPassword(passWord);
    }

    @When("I click on log in button")
    public void iClickOnLogInButton() {

        loginPage.clickLoginButton();
        getScreenShot();
    }

    @When("I click on logout button")
    public void iClickOnLogoutButton() {

        loginPage.clickLogoutButton();
    }
}

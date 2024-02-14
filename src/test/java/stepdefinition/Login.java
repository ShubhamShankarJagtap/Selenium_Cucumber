package stepdefinition;

import PageObject.LoginPage;
import Utility.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.util.Map;

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

    @And("I enter the email as <email>")
    public void iEnterTheEmailAsEmail(DataTable table) {

        String email = table.asMap().get("email");
        loginPage.enterEmail(email);
    }

    @And("I enter the password as <password>")
    public void iEnterThePasswordAsPassword(DataTable table) {

        String passWord = table.asMap().get("password");
        loginPage.enterPassword(passWord);
        loginPage.clickLoginButton();
        getScreenShot();
    }

    @Then("An error message should be displayed <errorMessage>")
    public void anErrorMessageShouldBeDisplayedErrorMessage(DataTable table) {

        Assert.assertEquals(loginPage.getEmptyPassword(), table.asList().get(0));
        Assert.assertEquals(loginPage.getInvalidCred(), table.asList().get(1));
        Assert.assertEquals(loginPage.getInvalidEmailErrorMsg(), table.asList().get(2));

    }

    @Then("An error message should be displayed {string}")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
    }
}

package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Map;

public class DataTable_Practical {

    @Given("I navigate to the website.")
    public void launchWebSite() {

        System.out.println("Website is https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter the user details")
    public void iEnterTheUserDetails(DataTable table) {

        List<List<String>> details = table.asLists(String.class);

        for (List<String> detail : details) {

            System.out.println(detail + "------------------------");
        }
    }

    @When("I enter the user details with map.")
    public void iEnterTheUserDetailsWithMap(DataTable table) {

        List<Map<String, String>> list = table.asMaps(String.class, String.class);
//        System.out.println(list.getFirst());

        for (Map<String, String> map : list){

            System.out.println(map.get("city"));
        }
    }

    @Then("User registration is successful.")
    public void userRegistrationIsSuccessful() {

        System.out.println("User registration is successful.");
    }

    @Given("I launch the browser {string}.")
    public void iLaunchTheBrowser(String browser) {

        System.out.println(browser);
    }

    @And("navigate to the url {string}")
    public void navigateToTheUrl(String url) {
        System.out.println(url);
    }

    @When("I click on register button.")
    public void iClickOnRegisterButton() {
        System.out.println("I am clicking on the url.");
    }

    @And("I enter the username as {string}")
    public void iEnterTheUsernameAs(String username) {
        System.out.println(username);
    }

    @And("I enter the mail as {string}")
    public void iEnterTheMailAs(String email) {
        System.out.println(email);
    }

    @And("I enter the country as {string}")
    public void iEnterTheCountryAs(String country) {
        System.out.println(country);
    }
}

package stepdefinition;

import PageObject.CustomerPage;
import PageObject.LoginPage;
import Utility.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CreateCustomer extends BaseClass {

    public WebDriver driver;

    public CustomerPage customerPage;


    @When("I click on the customers menu.")
    public void clickOnCustomerMenuButton() {

        new LoginPage(this.driver);
        this.customerPage = new CustomerPage(this.driver);
        customerPage.clickOnCustomersMenu();
    }

    @And("I click om the customers link.")
    public void iClickOmTheCustomersLink() {

        customerPage.clickOnCustomersLink();
    }

    @When("I click on Add new button")
    public void iClickOnAddNewButton() {

        customerPage.clickOnAddNewButton();
    }

    @When("I enter the Email as {string}")
    public void iEnterTheEmailAs(String Mail) {

        customerPage.enterEmail(Mail);
    }

    @And("I enter the PassWord as {string}")
    public void iEnterThePassWordAs(String Pass) {

        customerPage.enterPassWord(Pass);
    }

    @And("I enter the firstname as {string}")
    public void iEnterTheFirstnameAs(String FirstName) {

        customerPage.enterFirstName(FirstName);
    }

    @And("I enter the lastname as {string}")
    public void iEnterTheLastnameAs(String LastName) {

        customerPage.enterLastName(LastName);
    }

    @And("I select the gender as {string}")
    public void iSelectTheGenderAs(String Gender) {

        customerPage.selectGender(Gender);
    }

    @And("I enter the date of birth as {string}")
    public void iEnterTheDateOfBirthAs(String DOB) {

        customerPage.enterDate(DOB);
    }

    @And("I enter the company name as {string}")
    public void iEnterTheCompanyNameAs(String CompanyName) {

        customerPage.enterCompany(CompanyName);
    }

    @And("I click on tax exemption checkbox")
    public void iClickOnTaxExemptionCheckbox() {

        customerPage.isTaxExemption();
    }

    @Then("I verify the Newsletter option {string}")
    public void iVerifyTheNewsletterOption(String expectedLetter) {

        customerPage.newsLetter(expectedLetter);
    }

    @And("I click on Customer roles dropdown and select guests")
    public void iClickOnCustomerRolesDropdownAndSelectGuests() {

        customerPage.select_Customer_Roles();
    }

    @And("I click on the Active checkbox")
    public void iClickOnTheActiveCheckbox() {

        customerPage.selectActive();
    }

    @When("I enter the admin comment.")
    public void iEnterTheAdminComment() {

        customerPage.enterAdminContent();
    }

    @Then("I click on Save button")
    public void iClickOnSaveButton() {

        customerPage.saveCustomer();
    }

    @And("I click on Manager of vendors dropdown and select {string}")
    public void iClickOnManagerOfVendorsDropdownAndSelect(String ManagerOfVendor) {

        customerPage.selectMangerOfVendor(ManagerOfVendor);
    }

    @And("I click the Newsletter and enter {string}")
    public void iClickTheNewsletterAndEnter(String newsLetter) {

        customerPage.newsLetter(newsLetter);
    }

    @And("I click the Newsletter and select first option")
    public void iClickTheNewsletterAndSelectFirstOption() {

        customerPage.newsLetter("first");
    }
}

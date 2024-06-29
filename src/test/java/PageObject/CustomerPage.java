package PageObject;

import Utility.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;


public class CustomerPage extends BaseClass {

    public WebDriver driver;
    By customersMenu = By.xpath("//a[@href = '#']//p[contains(text(),'Customers')]");
    By customersLink = By.xpath("//a[@href=\"/Admin/Customer/List\"]");
    By addNewButton = By.xpath("//a[@href=\"/Admin/Customer/Create\"]");
    By Email = By.id("Email");
    By PassWord = By.id("Password");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Gender_Male = By.id("Gender_Male");
    By Gender_Female = By.id("Gender_Female");
    By date = By.id("DateOfBirth");
    By company = By.id("Company");
    By isTaxExempt = By.id("IsTaxExempt");
    By NewsLetter = By.xpath("//input[@style='width: 25px']");
    By guests = By.xpath("//li[text() = 'Guests']");
    By Manager_Of_Vendor = By.id("VendorId");
    By active = By.id("Active");
    By Admin_Comment = By.name("AdminComment");
    By save = By.name("save");

    public CustomerPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnCustomersMenu() {

        click(customersMenu);
    }

    public void clickOnCustomersLink() {

        click(customersLink);
    }

    public void clickOnAddNewButton() {

        click(addNewButton);
        getScreenShot();
    }

    public void enterEmail(String mail) {

        enterText(Email, mail);
    }

    public void enterPassWord(String pass) {

        enterText(PassWord, pass);
    }

    public void enterFirstName(String first_name) {

        enterText(FirstName, first_name);
    }

    public void enterLastName(String Last_name) {

        enterText(LastName, Last_name);
    }

    public void selectGender(String gender) {

        if (gender.equalsIgnoreCase("MALE"))
            click(Gender_Male);
        else click(Gender_Female);
    }

    public void enterDate(String Date) {

        enterText(date, Date);
    }

    public void enterCompany(String company_Name) {

        enterText(company, company_Name);
    }

    public void isTaxExemption() {

        click(isTaxExempt);
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) this.driver;
//        javascriptExecutor.executeScript("Window.scrollBy(0, 500)", "");
    }

    public void newsLetter(String letter) {

        click(NewsLetter);
        Actions actions = new Actions(BaseClass.driver);
        actions.sendKeys(Keys.ARROW_DOWN).click().perform();
        System.out.println(letter);
//        WebElement news = BaseClass.driver.findElement(NewsLetter);
//        String actualLetter = news.getText();
//        Assert.assertEquals(actualLetter, letter);
    }

    public void select_Customer_Roles() {

        WebElement Customer_Roles = driver.findElement(By.id("SelectedCustomerRoleIds_taglist"));
        click(Customer_Roles);
        Select select = new Select(Customer_Roles);
        select.selectByValue("Guests");
    }

    public void selectMangerOfVendor(String vendor) {

        enterText(Manager_Of_Vendor, vendor);
    }

    public void selectActive() {

        click(active);
    }

    public void enterAdminContent() {

        enterText(Admin_Comment, "Admin Name is Shubham shankar Jag_tap.");
    }

    public void saveCustomer() {

        click(save);
        getScreenShot();
    }
}


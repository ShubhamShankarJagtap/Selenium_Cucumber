package PageObject;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    public WebDriver driver;
    By Email = By.id("Email");
    By Password = By.id("Password");
    By LOG_IN = By.xpath("//button[text() = 'Log in']");
    By Logout = By.linkText("Logout");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){

        clearText(Email);
        enterText(Email, email);
    }

    public void enterPassword(String passWord){

        clearText(Password);
        enterText(Password, passWord);
    }

    public void clickLoginButton(){

        click(LOG_IN);
    }

    public void clickLogoutButton(){

        click(Logout);
    }
}

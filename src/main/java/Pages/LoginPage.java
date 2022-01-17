package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Core.WebConnector.driver;

public class LoginPage {

    private By clickSignIn = By.className("gn-title");
    private By userInputEmail = By.id("login-email");
    private By clickNextBtn = By.xpath("//button[contains(.,'Next')]");
    private By userInputPassword = By.id("login-password");
    private By clickOnSignIn = By.xpath("//button[@data-testid='identity-form-submit-button']");

    public LoginPage(Page page) {

    }

    public void clickSignIn(){
        driver.findElement(clickSignIn).click();
    }

    public void setUserInputEmail(String useremail){
        driver.findElement(userInputEmail).sendKeys(useremail);
    }

    public void clickNextBtn(){
        driver.findElement(clickNextBtn).click();
    }

    public void setUserInputPasswordBox(String password)  {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(userInputPassword).sendKeys(password);
    }
    public void userSignIn(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(clickOnSignIn).click();
    }
}

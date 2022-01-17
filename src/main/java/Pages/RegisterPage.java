package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Core.WebConnector.driver;

public class RegisterPage {


    private By userFirstName = By.xpath("//*[@id=\"sign-up-first-name\"]");
    private By userLastName = By.id("sign-up-last-name");
    private By userAge = By.id("sign-up-age");
    private By userEmail = By.id("sign-up-email");
    private By userPass = By.id("sign-up-password");
    private By signUpBtn = By.xpath("//button[@data-testid='identity-form-submit-button']");

    public RegisterPage(Page page) {

    }

    public void setUserFirstName(String userfirstname){
        driver.findElement(userFirstName).sendKeys(userfirstname);
    }
    public void setUserLastName(String userlastname){
        driver.findElement(userLastName).sendKeys(userlastname);
    }
    public void setUserAge(String age){
        driver.findElement(userAge).sendKeys(age);
    }
    public void setUserEmail(String useremail){
        driver.findElement(userEmail).sendKeys(useremail);
    }
    public void setUserPass(String pass){
        driver.findElement(userPass).sendKeys(pass);
    }
    public void clickOnSignUp(){
        driver.findElement(signUpBtn).click();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Core.WebConnector.driver;

public class FlickerUploadPhoto {

    private By emailId = By.id("login-email");
    private By clickEmail = By.xpath("//*[@id=\"login-form\"]/button");
    private By passWord = By.xpath("//*[@id=\"login-password\"]");
    private By logInBtn = By.xpath("//button[contains(.,'Sign in')]");
    private By chosePhoto = By.xpath("//input[@id=\"choose-photos-and-videos\"]");
    private By upBtn = By.id("action-publish");
    private By upload = By.id("confirm-publish");


    public FlickerUploadPhoto(Page page) {
    }

    public void setEmailId(String email){
        driver.findElement(emailId).sendKeys(email);
    }

    public void clickEmail(){
        driver.findElement(clickEmail).click();
    }

    public void setPassWord(String password){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickLogin(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(logInBtn).click();
    }

    public void setChosePhoto(String chosephoto){
        driver.findElement(chosePhoto).sendKeys(chosephoto);
    }

    public void uploadBtn(){
        driver.findElement(upBtn).click();
    }

    public void upLOad(){
        driver.findElement(upload).click();
    }

}

package Pages;

import Core.ConfigUtil;
import Core.WebConnector;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    LoginPage loginPage = new LoginPage(this);
    protected LoginPage getLoginPage() { return loginPage; }

    RegisterPage registerPage = new RegisterPage(this);
    protected RegisterPage getRegisterPage(){return registerPage;}

    FlickerUploadPhoto flickerUploadPhoto = new FlickerUploadPhoto(this);
    protected FlickerUploadPhoto getFlickerUploadPhoto(){
        return flickerUploadPhoto;
    }

}

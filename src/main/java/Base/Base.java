package Base;

import Core.WebConnector;
import Pages.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base extends Page {

    @Before("@login")
    public void startTest()  {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("weburl"));
        driver.manage().window().maximize();
    }

    @Before("@registation")
    public void startRegTest() throws Exception {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("regUrl"));
        driver.manage().window().maximize();
    }

    @Before("@upload")
    public void uploadPhotoTest()  {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("uploadPhoto"));
        driver.manage().window().maximize();
    }


    @Before("@photoShare")
    public void photoShareTest()  {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("uploadPhoto"));
        driver.manage().window().maximize();
    }

    @After
    public void afterTest() {
        if (driver != null) {
//            driver.quit();
        }

    }
}

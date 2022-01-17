package StepDefinitions;

import Pages.LoginPage;
import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep extends Page {


    @Given("user is in login Page")
    public void user_is_in_login_page() {
        getLoginPage().clickSignIn();
    }

    @When("user Enter {string} and {string}")
    public void user_enter_and(String email, String password) {
       getLoginPage().setUserInputEmail(email);
       getLoginPage().clickNextBtn();
       getLoginPage().setUserInputPasswordBox(password);
    }

    @And("click on login button")
    public void click_on_login_button() {
        getLoginPage().userSignIn();
    }

    @Then("Home page visible")
    public void home_page_visible() {
        // Write code here that turns the phrase above into concrete actions

    }

}

package StepDefinitions;
import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest extends Page {

    @Given("user is in sign up page")
    public void user_is_in_sign_up_page() {

        System.out.println("Sign up page is loading");

    }

    @When("user fill {string}, {string},{string}, {string} and {string}")
    public void user_fill_and(String username, String lastname, String age, String email, String pass) {

        getRegisterPage().setUserFirstName(username);
        getRegisterPage().setUserLastName(lastname);
        getRegisterPage().setUserAge(age);
        getRegisterPage().setUserEmail(email);
        getRegisterPage().setUserPass(pass);

    }

    @When("click on sign up button")
    public void click_on_sign_up_button() {

        getRegisterPage().clickOnSignUp();

    }

    @Then("Register successfully")
    public void register_successfully() {

    }

}

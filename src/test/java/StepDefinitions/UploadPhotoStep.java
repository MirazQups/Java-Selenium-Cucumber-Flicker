package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadPhotoStep extends Page {

    @Given("user enter email {string}")
    public void user_enter_email(String email) {
        getFlickerUploadPhoto().setEmailId(email);
    }

    @Given("user click email")
    public void user_click_email() {
        getFlickerUploadPhoto().clickEmail();
    }

    @When("user Enter password {string}")
    public void user_enter_password(String pass) {
        getFlickerUploadPhoto().setPassWord(pass);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        getFlickerUploadPhoto().clickLogin();
    }

    @When("user set photo {string}")
    public void user_set_photo(String photo) {
        getFlickerUploadPhoto().setChosePhoto(photo);
    }

    @When("user click upload btn")
    public void user_click_upload_btn() {
        getFlickerUploadPhoto().uploadBtn();
    }

    @Then("photo uploaded")
    public void photo_uploaded() {
        getFlickerUploadPhoto().upLOad();
    }


}

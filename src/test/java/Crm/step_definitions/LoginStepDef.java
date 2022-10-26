package Crm.step_definitions;

import Crm.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

    Pages pages = new Pages();
    @Given("User open browser")
    public void userOpenBrowser() {
        pages.genericFunctions().get();
    }
    @When("User on the website homepage")
    public void userOnTheWebsiteHomepage() {
        pages.genericFunctions().userOnTheWebsiteHomepage();
    }



    @And("User click with the {string}")
    public void userClickWithThe(String arg0) {
        pages.login().user_click_with_the(arg0);


    }

    @And("User enter password")
    public void userEnterPassword() {
        pages.login().enterPassword();

    }

    @And("User enter username")
    public void userEnterUsername() {
        pages.login().enterEmail();
    }

    @And("User click {string}")
    public void userClick(String arg0) {
        pages.login().user_click_logout(arg0);

    }
    @Then("User close browser")
    public void userCloseBrowser() {
        pages.genericFunctions().closeDriver();


    }
    @And("User enter username {string}")
    public void userEnterUsername(String arg0) {
        pages.login().enterEmailWithData(arg0);
    }
    @And("User enter password {string}")
    public void userEnterPassword(String arg0) {
        pages.login().enterPasswordWithData(arg0);
    }
    @And("User clear the box {string}")
    public void userClearTheBox(String arg0) {
        pages.login().clearEmailBox();
    }
    @Then("User verify message {string}")
    public void userVerifyMessage(String arg0) {
        pages.login().user_verify_message(arg0);
    }
    @Then("User clean the username password box")
    public void userCleanTheUsernamePasswordBox() {
        pages.login().clearEmailBox();
        pages.login().clearPasswordBox();
    }

    @When("User click the step back button")
    public void userClickTheStepBackButton() {
        pages.login().userClickTheStepBackButton();

    }
}

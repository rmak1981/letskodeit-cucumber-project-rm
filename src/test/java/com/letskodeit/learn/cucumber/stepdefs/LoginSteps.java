package com.letskodeit.learn.cucumber.stepdefs;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.pages.PracticePage;
import com.letskodeit.learn.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class LoginSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }
    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new SignUpPage().enterEmailAdd(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pwd)  {
        new SignUpPage().enterPassword(pwd);

    }

    @And("^I click on log in Button$")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLoginCommit();

    }


    @When("^I click on practice link$")
    public void iClickOnPracticeLink() {
        new HomePage().clickOnPracticeLink();

    }

    @Then("^I am on practice page$")
    public void iAmOnPracticePage() {
        new PracticePage().verifyTextPracticePage("Practice Page");

    }
}

package com.letskodeit.learn.cucumber.stepdefs;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.SignInPage;
import com.letskodeit.learn.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class MyStepdefs {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
        new HomePage().clickOnSignUpBtn();

    }

    @When("^I enter full name \"([^\"]*)\"$")
    public void iEnterFullName(String name){
        new SignUpPage().enterFullName(name);
    }



    @And("^I enter Confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String cpwd)  {
        new SignUpPage().enterConfirmPassword(cpwd);

    }

    @And("^I select check box for terms and conditions$")
    public void iSelectCheckBoxForTermsAndConditions() {
        new SignUpPage().checkBoxTermsAndCond();
    }

    @And("^I click on sign up button$")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpCommit();
    }

    @Then("^I sign up successfully$")
    public void iSignUpSuccessfully(String mucourse) {
        new SignInPage().verifySignupText(mucourse);

    }

    @And("^I click on gravatar$")
    public void iClickOnGravatar() {
        new SignInPage().clickOnAvatar();
    }

    @And("^I click on log out$")
    public void iClickOnLogOut() {
        new SignInPage().clickOnLogout();
    }

    @And("^I enter random email address$")
    public void iEnterRandomEmailAddress() {
        new SignUpPage().enterrandomEmailAdd();
    }
}

package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Practice")
    WebElement _practiceLink;

    @FindBy(linkText = "Login")
    WebElement _loginLink;

    @FindBy(linkText = "Sign Up")
    WebElement _signUpBtn;

    public void clickOnPracticeLink() {
        Reporter.addStepLog(" Click on  practice link: " + _practiceLink.toString() + "<br>");
        clickOnElement(_practiceLink);
        log.info(" Click on  practice link: " + _practiceLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.addStepLog(" Click on login link: " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info(" Click on login link: " + _loginLink.toString());
    }

    public void clickOnSignUpBtn() {
        Reporter.addStepLog(" Click on sign up button: " + _signUpBtn.toString() + "<br>");
        clickOnElement(_signUpBtn);
        log.info(" Click on sign up button: " + _signUpBtn.toString());
    }


}

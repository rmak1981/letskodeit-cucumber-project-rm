package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class SignUpPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());



    @FindBy(xpath = "//input[@id='user_name']")
    WebElement _fullNameFiled;

    @FindBy(xpath = "//input[@id='user_email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='user_password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='user_password_confirmation']")
    WebElement _confPasswordField;

    @FindBy(xpath = "//input[@id='user_agreed_to_terms']")
    WebElement _checkBoxTermsCond;

    @FindBy(xpath = "//input[@name='commit']")
    WebElement _signUpCommit;



    public void enterFullName(String fullname) {
        Reporter.addStepLog("enter full name " + fullname + "to the filed" + _fullNameFiled.toString() + "<br>");
        sendTextToElement(_fullNameFiled, fullname);
        log.info("enter full name " + fullname + "to the filed" + _fullNameFiled.toString());
    }

    public void enterEmailAdd(String email) {
        Reporter.addStepLog("enter email" + email + " to the filed" + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, email);
        log.info("enter email" + email + " to the filed" + _emailField.toString());
    }

    public void enterrandomEmailAdd() {
        String ragEmail = "ram" + getRandomString(5) + "@gmail.com";
        Reporter.addStepLog("enter email" + ragEmail + " to the filed" + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, ragEmail);
        log.info("enter email" + ragEmail + " to the filed" + _emailField.toString());
    }

    public void enterPassword(String pwd) {
        Reporter.addStepLog("enter password" + pwd + "to the field" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, pwd);
        log.info("enter password" + pwd + "to the field" + _passwordField.toString());
    }

    public void enterConfirmPassword(String cpwd) {
        Reporter.addStepLog("enter confirm password" + cpwd + "to the field" + _confPasswordField.toString() + "<br>");
        sendTextToElement(_confPasswordField, cpwd);
        log.info("enter confirm password" + cpwd + "to the field" + _confPasswordField.toString());
    }

    public void checkBoxTermsAndCond() {
        Reporter.addStepLog("check to select for terms and condition " + _checkBoxTermsCond.toString() + "<br>");
        checkBoxClick(_checkBoxTermsCond);
        log.info("check to select for terms and condition " + _checkBoxTermsCond.toString());
    }

    public void clickOnSignUpCommit() {
        Reporter.addStepLog("click on sign up " + _signUpCommit.toString());
        clickOnElement(_signUpCommit);
        log.info("click on sign up " + _signUpCommit.toString());
    }



}

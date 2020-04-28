package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @FindBy(xpath = "//input[@name='commit']")
    WebElement _loginCommit;


    public void clickOnLoginCommit(){
        Reporter.addStepLog("clicking on Log in commit " + _loginCommit.toString() + "<br>");
        clickOnElement(_loginCommit);
        log.info("clicking on Log in commit " + _loginCommit.toString());
    }


}
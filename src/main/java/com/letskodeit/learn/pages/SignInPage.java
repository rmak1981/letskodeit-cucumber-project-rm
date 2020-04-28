package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.UtilityRM;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class SignInPage extends UtilityRM {

    private static final Logger log = Logger.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'My Courses')]")
    WebElement _verifysignUpText;

    @FindBy(xpath = "//img[@class='gravatar']")
    WebElement _avatarClick;

    @FindBy (xpath = "//a[contains(text(),'Log Out')]")
    WebElement _logoutBtn;

    public void verifySignupText(String myCourse){
        Reporter.addStepLog("verify signUp" + myCourse + "get text" +_verifysignUpText.toString()+"<br>");
        verifyTextAssertMethod(_verifysignUpText,myCourse);
        log.info("verify signUp" + myCourse + "get text" +_verifysignUpText.toString());

    }
    public void clickOnAvatar(){
        Reporter.addStepLog("click on avatar image" + _avatarClick.toString()+"<br>");
        clickOnElement(_avatarClick);
        log.info("click on avatar image" + _avatarClick.toString());
    }
    public void clickOnLogout(){
        Reporter.addStepLog("click on logout" + _logoutBtn.toString());
        clickOnElement(_logoutBtn);
        log.info("click on logout" + _logoutBtn.toString());
    }
}

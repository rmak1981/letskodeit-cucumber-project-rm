package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(PracticePage.class.getName());

    @FindBy(xpath = "//div//h1[contains(text(),'Practice Page')]")
    WebElement _practicePageText;

    @FindBy(id = "bmwradio")
    WebElement _bmwRadioBtn;

    @FindBy(id = "carselect")
    WebElement _hondaDropDownMenuLink;

    public void verifyTextPracticePage(String veriTxt) {
        Reporter.addStepLog(" Verify text " + veriTxt + " is displayed " + _practicePageText.toString() + "<br>");
        verifyTextAssertMethod(_practicePageText, veriTxt);
        log.info(" Verify text " + veriTxt + " is displayed " + _practicePageText.toString());
    }

    public void clickOnBmwRadioBtn() {
        Reporter.addStepLog(" Click on bmw radio button: " + _bmwRadioBtn.toString() + "<br>");
        clickOnElement(_bmwRadioBtn);
        log.info(" Click on bmw radio button: " + _bmwRadioBtn.toString());
    }

    public void selectFromDropDownMenu() {
        Reporter.addStepLog(" Select honda from drop down menu " + _hondaDropDownMenuLink.toString() + "<br>");
        selectByIndexFromDropDown(_hondaDropDownMenuLink, 2);
        log.info(" Select honda from drop down menu " + _hondaDropDownMenuLink.toString());
    }

}

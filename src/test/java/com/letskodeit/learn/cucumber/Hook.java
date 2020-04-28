package com.letskodeit.learn.cucumber;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.basepage.BasePage;
import com.letskodeit.learn.browserselector.BrowserSelector;
import com.letskodeit.learn.loadproperty.LoadProperty;
import com.letskodeit.learn.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation 26 Apr 20
 */
public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseURL = loadProperty.getProperty("baseURL");

    // cucumber before class must need to selected
    @Before
    public void openBrowser() {

        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
        // assign author
        Reporter.assignAuthor("learn letskode it Prime 3", "GS-RM");
    }

    @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenShotPath = UtilityRM.getScreenshot(driver, scenario.getName());
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

}

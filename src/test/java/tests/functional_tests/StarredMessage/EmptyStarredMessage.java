package tests.functional_tests.StarredMessage;

import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class EmptyStarredMessage extends TestBase {

    @Test
    public void emptyStarredMessage() {

        extentLogger = report.createTest("Empty starred message text test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging with username and password with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Starred message button");
        pages.starredMessage().starredMessageLinkButton.click();

        extentLogger.info("Verifying empty starred message text");
        pages.starredMessage().emptyStarredMessageText.getText();

        extentLogger.info("Verifying actual empty starred message text equals to expected inbox message text");
        assertEquals(pages.starredMessage().emptyStarredMessageText.getText(), ApplicationConstants.EMPTYINBOXMESSAGETEXT);

        extentLogger.pass("Pass : Starred message text test");

    }


}

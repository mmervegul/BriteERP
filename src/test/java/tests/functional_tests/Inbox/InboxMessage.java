package tests.functional_tests.Inbox;

import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.*;

public class InboxMessage extends TestBase {

    @Test
    public void inboxMessageTest(){

        extentLogger = report.createTest("Inbox message test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on InboxMessage button");
        pages.inbox().inboxButton.click();

        extentLogger.info("Getting actual message");
        String actualText = pages.inbox().inboxEmptyMessage.getText();

        extentLogger.info("Verifying actual message");
        assertEquals(actualText, "Congratulations, your inbox is empty");

        extentLogger.info("Title contains InboxMessage");
        assertEquals(driver.getTitle(), ApplicationConstants.PUBLICCHANNELS);

        extentLogger.pass("Passed : Inbox message test");





    }
}

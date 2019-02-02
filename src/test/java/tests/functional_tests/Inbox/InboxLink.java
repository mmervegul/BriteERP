package tests.functional_tests.Inbox;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class InboxLink extends TestBase {

    @Test
    public void inboxLinkTest(){

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on InboxMessage button");
        pages.inbox().inboxButton.click();

        extentLogger.pass("Pass : Inbox Message link button is clickable");


    }

}

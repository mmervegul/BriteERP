package tests.functional_tests.StarredMessage;

import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class AddStarredMessage extends TestBase {

    @Test
    public void addStarredMessage() {

        extentLogger = report.createTest("Add starred message test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging with username and password with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        extentLogger.info("Clicking on star button");
        pages.starredMessage().starButton.click();

        extentLogger.pass("Pass : Add starred message test");

    }
}

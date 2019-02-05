package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class AddAChannelDisplayedTest extends TestBase {

    @Test
    public void addAChannelDisplayedTest() {

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on plus sign");
        pages.generalChanel().channelsPlusSign.click();

        extentLogger.info("Adding a channel box button");
        pages.generalChanel().addAChannelBox.click();

        Assert.assertTrue(pages.generalChanel().addAChannelBox.isDisplayed());

        extentLogger.pass("Pass : 'Add a channel' displayed test");
    }
}

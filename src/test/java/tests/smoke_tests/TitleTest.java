package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class TitleTest extends TestBase {

    @Test
    public void generalChannelTitleTest() {

        extentLogger = report.createTest("Page headers test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Verifying public channels title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.PUBLICCHANNELS);

        extentLogger.pass("Pass : General channel title test");

    }



}

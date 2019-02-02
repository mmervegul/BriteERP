package tests.functional_tests.GeneralChannel;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ShowOlderMessages extends TestBase {

    @Test
    public void showOlderMessages(){

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging with username and password with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        extentLogger.info("Verifying public channels title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.PUBLICCHANNELS);

        extentLogger.info("Showing older messages");
        pages.generalChanel().showOlderMessages.click();

        extentLogger.pass("Pass : Show older messages test");


    }
}

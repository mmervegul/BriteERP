package tests.functional_tests.GeneralChannel;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickOnShowOlderMessages extends TestBase {

    @Test
    public void clickOnShowOlderMessages(){

        extentLogger = report.createTest("Click on show older message test");

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

        extentLogger.info("Verifying public channels title");
        assertEquals(driver.getTitle(), ApplicationConstants.PUBLICCHANNELS);

        extentLogger.info("Showing older messages");
        pages.generalChanel().showOlderMessages.click();

        extentLogger.pass("Pass : Click on show older messages test");


    }
}

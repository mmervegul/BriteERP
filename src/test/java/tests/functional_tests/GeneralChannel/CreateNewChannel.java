package tests.functional_tests.GeneralChannel;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class CreateNewChannel extends TestBase {

    @Test
    public void createAChannel() {

        extentLogger = report.createTest("Create a channel test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on plus sign");
        pages.generalChanel().channelsPlusSign.click();

        extentLogger.info("Adding a channel box button");
        pages.generalChanel().addAChannelBox.click();

        extentLogger.info("Writing a new channel name");
        pages.generalChanel().addAChannelBox.sendKeys("New Events");

        extentLogger.info("Clicking on new channel name");
        pages.generalChanel().clickName.click();

        extentLogger.pass("Pass : Create a channel test");



    }
}

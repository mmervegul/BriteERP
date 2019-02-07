package tests.functional_tests.Channels;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickLeaveButton extends TestBase {

    @Test
    public void clickOnLeaveButton(){

        extentLogger = report.createTest("Click on leave button");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Clicking on Leave button");
        pages.channels().leaveButtonForTeamChannel.click();

        extentLogger.pass("Pass : Click on Leave button");
    }
}

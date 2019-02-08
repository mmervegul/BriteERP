package tests.functional_tests.PrivateChannels;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickOnPlusSign extends TestBase {

    @Test
    public void clickOnPlusSign() {

        extentLogger = report.createTest("Click on plus sign test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on private channel plus sign");
        pages.privateChannel().privateChannelPlusButton.click();

        extentLogger.pass("Pass : Click on plus sign test");

    }
}

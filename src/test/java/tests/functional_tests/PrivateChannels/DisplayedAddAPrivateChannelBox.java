package tests.functional_tests.PrivateChannels;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class DisplayedAddAPrivateChannelBox extends TestBase {

    @Test
    public void displayedAddAPrivateChannelbOX() {

        extentLogger = report.createTest("Displayed 'Add a private channel' box test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on private channel plus sign");
        pages.privateChannel().privateChannelPlusButton.click();

        extentLogger.info("Checking 'Add a private channel' box");
        pages.privateChannel().addAPrivateChannelBox.isDisplayed();

        extentLogger.pass("Pass : Displayed 'Add a private channel box' test");

    }
}

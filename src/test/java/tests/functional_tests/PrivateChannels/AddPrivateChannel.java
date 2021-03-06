package tests.functional_tests.PrivateChannels;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class AddPrivateChannel extends TestBase {

    @Test
    public void addPrivateChannel() {

        extentLogger = report.createTest("Add a private channel test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on private channel plus sign");
        pages.privateChannel().privateChannelPlusButton.click();

        extentLogger.info("Adding a new private channel");
        pages.privateChannel().addAPrivateChannelBox.sendKeys("NEW TEAM", Keys.ENTER);

        extentLogger.pass("Pass : Add a private channel test");

    }
}

package tests.functional_tests.PrivateChannels;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class DisplayedNewTeamPrivateChannel extends TestBase {

    @Test
    public void displayedNewTeamPrivateChannel() {

        extentLogger = report.createTest("Displayed 'New team' private channel test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Checking 'New team' private channel is displayed");
        pages.privateChannel().newTeamPrivateChannel.isDisplayed();

        extentLogger.pass("Pass : Displayed 'New team' private channel test");
    }
}

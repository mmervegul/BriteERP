package tests.functional_tests.Channels;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickJoinButton extends TestBase {

    @Test
    public void clickOnJoinButton(){

        extentLogger = report.createTest("Click on join button test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Joining the Events channel");
        pages.channels().joinButtonForEventChannel.click();

        extentLogger.pass("Pass : Click on join button test");


    }

}

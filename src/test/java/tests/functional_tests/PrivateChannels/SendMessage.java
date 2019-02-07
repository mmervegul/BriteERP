package tests.functional_tests.PrivateChannels;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class SendMessage extends TestBase {

    @Test
    public void sendMessage() {

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();




    }
}

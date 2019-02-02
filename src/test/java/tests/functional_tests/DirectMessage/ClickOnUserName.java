package tests.functional_tests.DirectMessage;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickOnUserName extends TestBase {

    @Test
    public void clickOnUserName(){

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().salesUserLogin();


    }
}

package tests.functional_tests.DirectMessage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickOnUserName extends TestBase {

    @Test
    public void clickOnUserName(){

        extentLogger = report.createTest("Click on username test");

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


    }
}

package tests.functional_tests.DirectMessage;

import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class LeaveChannel extends TestBase {

    @Test
    public void leaveSalesManager3Channel() {

        extentLogger = report.createTest("Leave from sales manager 3 channel test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging with username and password with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on x sign");
        pages.directMessage().leaveFromSalesManager3Channel.click();

        extentLogger.pass("Pass : Leave from sales manager 3 channel test");

    }
}

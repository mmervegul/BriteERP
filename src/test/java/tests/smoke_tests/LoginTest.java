package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void salesManagerUserLogin(){

        extentLogger = report.createTest("Page headers test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.pass("Pass : Manager user login test");
    }

    @Test
    public void salesUserLogin(){

        extentLogger = report.createTest("Page headers test");

        driver.manage().window().maximize();

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().salesUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.pass("Pass : Sales user login test");
    }


}

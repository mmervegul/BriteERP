package tests.smoke_tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void salesManagerUserLogin(){

        extentLogger = report.createTest("Sales manager user login test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.pass("Pass : Manager user login test");
    }

    @Test
    public void salesUserLogin(){

        extentLogger = report.createTest("Sales user login test");

        driver.manage().window().maximize();

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().salesUserLogin();

        extentLogger.info("Verifying login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.pass("Pass : Sales user login test");
    }

    @Test
    public void negativeSalesManagerUserLogin(){

        extentLogger = report.createTest("Negative sales manager user login test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Cannot logging to the application with correct username and wrong password");
        pages.login().negativeManagerUserLogin();

        extentLogger.info("Verifying wrong login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.WRONGLOGINPAGETITLE);

        extentLogger.info("Verifying wrong login/password message");
        assertEquals(pages.login().wrongLoginPasswordMessage.getText(), ApplicationConstants.WRONGLOGINMESSAGE);

        extentLogger.fail("Pass : Negative Manager user login test");
    }

    @Test
    public void negativeSalesUserLogin(){

        extentLogger = report.createTest("Negative sales user login test");

        driver.manage().window().maximize();

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Cannot logging to the application with correct username and wrong password");
        pages.login().negativeSalesUserLogin();

        extentLogger.info("Verifying wrong login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.WRONGLOGINPAGETITLE);

        extentLogger.info("Verifying wrong login/password message");
        assertEquals(pages.login().wrongLoginPasswordMessage.getText(), ApplicationConstants.WRONGLOGINMESSAGE);

        extentLogger.fail("Pass : Negative Sales user login test");
    }


}

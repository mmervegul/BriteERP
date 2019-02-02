package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class NegativeLoginTest extends TestBase {

    @Test
    public void negativeSalesManagerUserLogin(){

        extentLogger = report.createTest("Page headers test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Cannot logging to the application with correct username and wrong password");
        pages.negativeLogin().negativeManagerUserLogin();

        extentLogger.info("Verifying wrong login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.WRONGLOGINPAGETITLE);

        extentLogger.info("Verifying wrong login/password message");
        Assert.assertEquals(pages.negativeLogin().wrongLoginPasswordMessage.getText(), ApplicationConstants.WRONGLOGINMESSAGE);

        extentLogger.fail("Pass : Negative Manager user login test");
    }

    @Test
    public void negativeSalesUserLogin(){

        extentLogger = report.createTest("Page headers test");

        driver.manage().window().maximize();

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Cannot logging to the application with correct username and wrong password");
        pages.negativeLogin().negativeSalesUserLogin();

        extentLogger.info("Verifying wrong login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.WRONGLOGINPAGETITLE);

        extentLogger.info("Verifying wrong login/password message");
        Assert.assertEquals(pages.negativeLogin().wrongLoginPasswordMessage.getText(), ApplicationConstants.WRONGLOGINMESSAGE);

        extentLogger.fail("Pass : Negative Sales user login test");
    }
}

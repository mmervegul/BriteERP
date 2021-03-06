package tests.functional_tests.DirectMessage;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class SendDirectMessage extends TestBase {

    @Test
    public void sendDirectMessage() {

        extentLogger = report.createTest("Send direct message test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging with username and password with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on direct message plus sign");
        pages.directMessage().directMessagePlusSign.click();

        extentLogger.info("Clicking on user name");
        pages.directMessage().usernameSearchBox.sendKeys("SalesManager4");

        extentLogger.info("Clicking on 'SalesManager4' user");
        pages.directMessage().salesManager4.click();

        extentLogger.info("Clicking on 'Write something' box and writing message");
        pages.directMessage().writeSomethingBoxForDirectMessage.sendKeys("Hello", Keys.ENTER);

        extentLogger.pass("Pass : Send direct message test");

    }
}

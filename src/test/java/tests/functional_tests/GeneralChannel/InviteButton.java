package tests.functional_tests.GeneralChannel;

import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class InviteButton extends TestBase {

    @Test
    public void clickInviteButton() {

        extentLogger = report.createTest("Click invite button test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        extentLogger.info("Clicking on Invite button");
        pages.generalChanel().inviteButton.click();

        extentLogger.pass("Pass : Click invite button test");

    }
}

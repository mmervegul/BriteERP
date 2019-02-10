package tests.functional_tests.GeneralChannel;

import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class InviteUser extends TestBase {

    @Test
    public void inviteUser() {

        extentLogger = report.createTest("Invite user test");

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

        extentLogger.info("Clicking on search box");
        pages.generalChanel().searchBox.click();

        extentLogger.info("Selecting EventsCRM_Manager4 user");
        pages.generalChanel().EventsCRM_Manager4.click();

        extentLogger.info("Clicking on invite button");
        pages.generalChanel().secondInviteButton.click();

        extentLogger.pass("Pass : Invite user test");

    }
}

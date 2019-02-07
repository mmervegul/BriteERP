package tests.functional_tests.PrivateChannels;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;
public class Brit_850 extends TestBase{

    @Test
    public void BRIT_850() {


        extentLogger = report.createTest("" + " Verify that user should be able to add private " +
                "channels when click on the plus sign on the right side");

        extentLogger.info("1 Open Url");

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        extentLogger.info("2 Click Brite Erp Demo");
        extentLogger.info("Expected result");

        pages.homepage().britErpDemoButton.click();

        extentLogger.info("3 Enter valid username and password then click on login/button");
        extentLogger.info("Expected result: System should display login button succesfully");
        pages.homepage().email_box.sendKeys(ConfigurationReader.getProperty("managerUserName"));
        pages.homepage().password_box.sendKeys(ConfigurationReader.getProperty("managerPassword"));
        pages.homepage().loginbutton.click();
        pages.homepage().privateChannel.click();
        pages.homepage().addAPrivateChannel.click();
    }
}

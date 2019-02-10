package tests.functional_tests.GeneralChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class FindAllUserName extends TestBase {

    @Test
    public void displayedAllUserName() {

        extentLogger = report.createTest("Displayed all username test");

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

        extentLogger.info("Displaying all username");

        List<WebElement> allUsers = driver.findElements(By.xpath("//div[@id='select2-drop']"));

        for (WebElement str : allUsers) {
            System.out.println(str.getText());
        }

        extentLogger.pass("Pass : Displayed all username test");

    }
}

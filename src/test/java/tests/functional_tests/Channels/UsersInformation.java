package tests.functional_tests.Channels;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;
import org.openqa.selenium.WebElement;
import java.util.List;

public class UsersInformation extends TestBase {

    @Test
    public void usersInformationTest(){

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Clicking on General Channel button");
        pages.channels().generalChannel.click();

        extentLogger.info("Clicking on Members link");
        pages.channels().members.click();

        extentLogger.info("Getting all members information");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']"));

        for (WebElement header : allRows) {
            System.out.println(header.getText());
        }

        extentLogger.pass("Pass : Uses information test");
    }
}

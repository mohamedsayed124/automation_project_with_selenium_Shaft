package Facebook;

import Pages.P01_Login;
import Pages.P02_HomePage;
import Pages.P03_AdminPage;
import Pages.P04_AddButton;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testdata;
//    By username = By.xpath("//input[@name=\"username\"]");
//    By password = By.xpath("//input[@name=\"password\"]");
//    By login = By.xpath("//button[@type=\"submit\"]");


    @Test
    public void login() throws InterruptedException {
       new P01_Login(driver).loginsteps(testdata.getTestData("username"),testdata.getTestData("password"));
        Thread.sleep(2000);
        new P02_HomePage(driver).clickadmin();
        Thread.sleep(2000);
        new P03_AdminPage(driver).veiwrecordes();
        new P04_AddButton(driver).clickButton();
    }
    @BeforeMethod
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        testdata = new SHAFT.TestData.JSON("orangeTestdata.json");
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}


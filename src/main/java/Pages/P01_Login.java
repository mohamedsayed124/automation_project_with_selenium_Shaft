package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_Login {
    SHAFT.GUI.WebDriver driver;
    public P01_Login(SHAFT.GUI.WebDriver driver){this.driver=driver;}
        By user_name = By.xpath("//input[@name=\"username\"]");
        By pass_word = By.xpath("//input[@name=\"password\"]");
        By login = By.xpath("//button[@type=\"submit\"]");




    public void loginsteps(String username, String password ){
        driver.browser().navigateToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.element().type(user_name,username)
                .type(pass_word,password)
                .click(login);}

    }

    //methods

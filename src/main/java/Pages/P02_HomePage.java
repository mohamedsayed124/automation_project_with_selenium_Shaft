package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;
    public P02_HomePage(SHAFT.GUI.WebDriver driver){this.driver=driver;}
        By adminname = By.linkText("Admin");




    public void clickadmin(){
        driver.element().click(adminname);
    }


    }

    //methods

package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P04_AddButton {
    SHAFT.GUI.WebDriver driver;
    public P04_AddButton(SHAFT.GUI.WebDriver driver){this.driver=driver;}

        By button = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");




    public void clickButton(){
         driver.element().click(button);

    }
    public void fulldata(){
        driver.element().type(By.xpath("//input[@name=\"firstName\"]"),"Mohammad");
    }


    }

    //methods

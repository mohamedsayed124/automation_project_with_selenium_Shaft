package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_AdminPage {
    SHAFT.GUI.WebDriver driver;
    public P03_AdminPage(SHAFT.GUI.WebDriver driver){this.driver=driver;}

        By numberofrecordes = By.xpath("//span[@class=\"oxd-text oxd-text--span\"] [contains(.,'Records')]");




    public void veiwrecordes(){
      String cout =   driver.element().getText(numberofrecordes).replaceAll("[^0-9]","");
        System.out.println("this is recordes"+cout);
    }


    }

    //methods

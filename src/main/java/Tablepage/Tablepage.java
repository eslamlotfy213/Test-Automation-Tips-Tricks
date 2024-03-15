package Tablepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tablepage {

    private  By tableCheckbox(String countryName) {
         return  By.xpath("//td[.='"+countryName+"']//parent::tr//input[@type='checkbox']");
    }

    WebDriver driver;
    public Tablepage(WebDriver driver){
        this.driver = driver;
    }


    public void clickOnTableCheck(String countryName){
        driver.findElement(tableCheckbox(countryName)).click();
    }


}

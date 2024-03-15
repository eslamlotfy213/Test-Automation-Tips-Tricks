package Tablepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicLocatorTest {

    private WebDriver driver;

    private Tablepage tablepage;


    @BeforeClass
    public void setDriver(){
        driver = new ChromeDriver();
        tablepage = new Tablepage(driver);
        driver.get("https://cosmocode.io/automation-practice-webtable/");
    }



    @Test
    public  void DynamicLocator(){
        tablepage.clickOnTableCheck("Egypt");
    }



}

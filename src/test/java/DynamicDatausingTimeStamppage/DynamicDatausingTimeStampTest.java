package DynamicDatausingTimeStamppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicDatausingTimeStampTest {

    private WebDriver driver;
    LoginPage loginPage;


    @BeforeClass
    public void setDriver()
    {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       loginPage = new LoginPage(driver);
    }


    @Test
    public  void DynamicDatausingTimeStamp(){
        // String currentTimestamp = String.valueOf(System.currentTimeMillis());
        String currentTimestamp =  new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
         String email = "test"+ currentTimestamp + "@test.com";
         loginPage.navigateUrl();
         loginPage.login("test",email);
    }


}

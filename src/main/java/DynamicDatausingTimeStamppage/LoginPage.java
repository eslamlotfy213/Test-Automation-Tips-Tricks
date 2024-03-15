package DynamicDatausingTimeStamppage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private WebDriver driver;
    private String URL ="https://automationexercise.com/signup";


    private  By usernameinput = By.name("name");
    private  By emailinput = By.xpath("//input[@data-qa='signup-email']");


    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateUrl(){
        driver.get(URL);
    }


    public void  login(String name , String email)
    {
        driver.findElement(usernameinput).sendKeys(name);
        driver.findElement(emailinput).sendKeys(email, Keys.ENTER);
    }


}

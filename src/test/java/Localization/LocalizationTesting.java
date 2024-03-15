package Localization;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class LocalizationTesting {


    WebDriver driver;
    JSONParser jsonParser;
    JSONObject jsonObject;

    Properties pro;

    FileInputStream fis;
    @BeforeClass
    public void  beforclass() throws IOException, ParseException
    {
        //src/test/java/Localization/TestData_EN.json
        //System.getProperty("language")  =====> EN  or AR
        pro = new Properties();
        fis = new FileInputStream("src/test/java/Localization/environment.properties");
        pro.load(fis);
        jsonParser = new JSONParser();
        jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/test/java/Localization/TestData_"+pro.getProperty("language")+".json"));
    }


    @Test
    public void testLocalizationTesting() throws IOException, ParseException
    {
        String value= (String)jsonObject.get("SearchQuery");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/ncr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys(value, Keys.ENTER);
    }




    @AfterClass
    public  void afterClass(){
        driver.quit();
    }




}

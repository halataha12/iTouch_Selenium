package Testcases;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class T00_BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new DriverFactory().initializeDriver();
        driver.get("https://www.itoucheg.com/");


    }
}

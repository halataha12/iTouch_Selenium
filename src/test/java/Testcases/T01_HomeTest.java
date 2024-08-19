package Testcases;

import Pages.P01_HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class T01_HomeTest extends T00_BaseTest {
    P01_HomePage homePage;
    @Test
    public void checkHomePageLogo() {
    homePage=new P01_HomePage(driver);
    if (homePage.checkHomePageIsLoaded() == true) {
        System.out.println("Logo Displayed successfully");
    } else {
        System.out.println("Logo doesn't Display");
    }
    }


}

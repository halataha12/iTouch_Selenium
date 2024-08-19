package Testcases;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage;
    @Test
    public void checkHomePageLogo() {
    homePage=new HomePage(driver);
    if (homePage.checkHomePageIsLoaded() == true) {
        System.out.println("Logo Displayed successfully");
    } else {
        System.out.println("Logo doesn't Display");
    }
    }
}

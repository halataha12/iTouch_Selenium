package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {
    private WebDriver driver;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    By LogoElement=By.xpath("//img[@class='header_logo header-logo']");


    public Boolean checkHomePageIsLoaded(){
        WebElement homeLogoElement = driver.findElement(LogoElement);
        return homeLogoElement.isDisplayed();
    }

}

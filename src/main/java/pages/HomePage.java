package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    By signupTab = By.cssSelector("a[href=\"/login\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignUpTab()
   {
      clickElement(signupTab);
   }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  extends PageBase{

    By signupNameField = By.cssSelector("input[data-qa=\"signup-name\"]");
    By emailField = By.xpath("//input[@data-qa=\"signup-email\"]");
    By signupButton =By.xpath("//button[@data-qa=\"signup-button\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  void enterMail(String text){
        scrollToElement(emailField);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(emailField)));
        enterText(emailField,text);
    }
    public void enterName(String text){
       enterText(
               signupNameField,text);
    }
    public void clickOnSignUp(){
        scrollToElement(signupButton);
        clickElement(signupButton);
    }
}

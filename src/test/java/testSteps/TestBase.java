package testSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
public class TestBase {
   public WebDriver driver= new ChromeDriver();
    @BeforeTest
    public void openBrowser() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");

    }
    @AfterTest
    public void quitBrowser() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

}

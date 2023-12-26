package testSteps;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignUpTC extends TestBase{


    HomePage HP = new HomePage(driver);
    LoginPage LP= new LoginPage(driver);
    Faker fake = new Faker();
    Configuration con = new Configuration();


@DataProvider
     public Object[][] generateData(){
      Object[][] data =  new Object[3][2];
      data[0][0]= "test1@gmail.com";
      data[0][1]="testone";

    data[1][0]= "test2@gmail.com";
    data[1][1]="testtwo";

    data[2][0]= "test3@gmail.com";
    data[2][1]="testthree";
    return data;

}
    @Test(dataProvider = "generateData")
    public void positiveScenario(String email,String name) throws IOException {
        con.set("Email",email);
        HP.clickOnSignUpTab();
        LP.enterName(name);
        LP.enterMail(email);
        LP.clickOnSignUp();
        System.out.println(con.get("Email"));
        Assert.assertEquals(LP.getPageTitle(),"Automation Exercise - Signup");

    }

}

package tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import steps.LoginSteps;
import utils.PropertyReader;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private static WebDriver driver;
    LoginSteps steps;
    private Object LoginPage;

    public static WebDriver getDriver(){
        return driver;
    }

   @BeforeClass
    public void setUp(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.WIN10);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("94");
        try {
            driver = new RemoteWebDriver(new URL("http://169.254.200.162:4444"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
       driver.get(PropertyReader.getURL());


        driver.manage().window().maximize();


        steps = new LoginSteps();
    }

    @AfterClass
    public void tearDown(){

        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

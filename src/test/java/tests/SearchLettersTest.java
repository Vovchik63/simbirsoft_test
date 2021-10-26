package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import utils.PropertyReader;

public class SearchLettersTest extends BaseTest {
    @Test
    public void test(){
        String address = "selenium.test.simbirsoft@gmail.com";
        String theme = "Simbirsoft Тестовое задание";
        steps.executFillLogin(PropertyReader.getLogin())
                .executeFillPasword(PropertyReader.getPassword())
                .executeGetCountThemesAndSendMessage(address,theme);

    }


}

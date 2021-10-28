package tests;

import org.testng.annotations.Test;
import utils.PropertyReader;

public class SearchLettersTest extends BaseTest {
    @Test
    public void countLettersWithNeedThemesAndSendLetter() {
        String address = "selenium.test.simbirsoft@gmail.com";
        String theme = "Simbirsoft Тестовое задание";
        steps.executeFillLogin(PropertyReader.getLogin())
             .executeFillPasword(PropertyReader.getPassword())
             .executeGetCountThemesAndSendMessage(address, theme);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MailBoxPage extends BasePage {
    @FindBy(css = "span.bog")
    private List<WebElement> webElements;
    @FindBy(css = "div.T-I.T-I-KE.L3")
    private WebElement writeButton;
    @FindBy(xpath = "//div/textarea[@role='combobox']")
    private WebElement toWhomLetterField;
    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElement themeLetterField;
    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement contentLetterField;
    @FindBy(css = "div.T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")
    private WebElement sendLetterButton;
    private final String  SELECTOR_INFO_ABOUT_SENDING = "div.vh span.aT";




    public int countNeedThemesInWebElements(String themeForSearch){

        int result = 0;
        for (WebElement element:webElements){
            if (element.getText().equals(themeForSearch)){
                result++;
            }
        }
        return result;
    }

    public void clickWriteButton(){
        elementClick(writeButton);
    }

    public void filltoWhomField(String address){
        elementClick(toWhomLetterField);
        pasteTextInElement(toWhomLetterField,address);
        toWhomLetterField.sendKeys(Keys.ENTER);

    }

    public void fillToThemeLetterField(String themeForLetter){

        elementClick(themeLetterField);
        pasteTextInElement(themeLetterField, themeForLetter);
    }

    public void fillToContentLetterField(String themeForSearch){
        String countNeedThemes = String.valueOf(countNeedThemesInWebElements(themeForSearch));
        elementClick(contentLetterField);
        pasteTextInElement(contentLetterField, countNeedThemes);
    }
    public void clickSendLetterButton(){
        elementClick(sendLetterButton);
    }
    public void waitInfoAboutSending(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SELECTOR_INFO_ABOUT_SENDING)));
    }


}

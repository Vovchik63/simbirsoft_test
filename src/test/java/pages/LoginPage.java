package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "identifierId")
    private WebElement loginField;
    @FindBy(css = "button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b")
    private WebElement nextLoginPageButton;

    public void fillLogin(String text) {
        fillTextInElement(loginField, text);
    }

    public void clickNextLoginPageButton() {
        elementClick(nextLoginPageButton);
    }


}

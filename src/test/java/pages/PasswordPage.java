package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends BasePage {
    @FindBy(css = "#password input")
    private WebElement passwordField;
    @FindBy(css = "button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b")
    private WebElement nextPasswordPageButton;

    public void fillPassword(String password){
        pasteTextInElement(passwordField,password);
    }

    public void clickNextButton(){
        elementClick(nextPasswordPageButton);
    }

}

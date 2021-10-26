package steps;

import pages.MailBoxPage;
import tests.BaseTest;

public class MailBoxSteps {
    MailBoxPage mailBoxPage = new MailBoxPage();



    public void executeGetCountThemesAndSendMessage(String address,String themeForLetter){
        mailBoxPage.clickWriteButton();
        mailBoxPage.filltoWhomField(address);
        mailBoxPage.fillToThemeLetterField(""+themeForLetter+" ����������");
        mailBoxPage.fillToContentLetterField(themeForLetter);
        mailBoxPage.clickSendLetterButton();
        mailBoxPage.waitInfoAboutSending();

    }
}
package steps;

import pages.MailBoxPage;

public class MailBoxSteps {
    private MailBoxPage mailBoxPage = new MailBoxPage();

    public void executeGetCountThemesAndSendMessage(String address, String themeForLetter) {
        mailBoxPage.clickWriteButton();
        mailBoxPage.filltoWhomField(address);
        mailBoxPage.fillToThemeLetterField("" + themeForLetter + " Рекшинский");
        mailBoxPage.fillToContentLetterField(themeForLetter);
        mailBoxPage.clickSendLetterButton();
        mailBoxPage.waitInfoAboutSending();
    }
}

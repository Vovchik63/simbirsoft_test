package steps;

import pages.PasswordPage;

public class PasswordSteps {
    PasswordPage passwordPage = new PasswordPage();

    public MailBoxSteps executeFillPasword(String password) {
        passwordPage.fillPassword(password);
        passwordPage.clickNextButton();
        return new MailBoxSteps();
    }
}

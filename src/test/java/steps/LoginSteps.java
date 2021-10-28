package steps;

import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage();

    public PasswordSteps executeFillLogin(String login) {
        loginPage.fillLogin(login);
        loginPage.clickNextLoginPageButton();
        return new PasswordSteps();
    }
}

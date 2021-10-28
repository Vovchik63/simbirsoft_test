package steps;

import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    public PasswordSteps executFillLogin(String login) {
        loginPage.fillLogin(login);
        loginPage.clickNextLoginPageButton();
        return new PasswordSteps();
    }
}

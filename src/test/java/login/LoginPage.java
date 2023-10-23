package login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement usernameField = $("#user_email");
    private final SelenideElement passwordField = $("#user_password");
    private final SelenideElement loginButton = $(".btn.btn-block.btn-primary");

    public void login(String username, String password) {
        usernameField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }
}

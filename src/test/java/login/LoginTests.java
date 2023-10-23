package com.test.task.login;

import com.codeborne.selenide.Condition;
import login.LoginPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    private static final String username = "borysenko.ser@gmail.com";
    private static final String password = "123456qwerty";
    private static final String url = "http://feature.12413.builder.abmcloud.us";

    @Test
    public void testLogin() {
        open(url);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        $(".ng-alert.alert-success").shouldHave(Condition.text("Signed in successfully."));


    }

    @Test
    public void testInvalidEmail() {
        open(url);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username + 1, password);

        $(".text-danger").shouldHave(Condition.text("Email or password is incorrect"));


        // Add assertion to verify unsuccessful login
    }

    @Test
    public void testInvalidPassword() {
        open(url);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password + 1);

        $(".text-danger").shouldHave(Condition.text("Email or password is incorrect"));

        // Add assertion to verify unsuccessful login
    }
}

package exchange;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ExchangePage {
    private final SelenideElement hostField = $("#host");
    private final SelenideElement portField = $("#port");
    private final SelenideElement loginField = $("#login");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement thresholdField = $("#threshold");
    private final SelenideElement saveButton = $("#saveButton");
    private final SelenideElement deleteButton = $("#deleteButton");

    public void fillExchangeDetails(String host, String port, String login, String password, String threshold) {
        hostField.setValue(host);
        portField.setValue(port);
        loginField.setValue(login);
        passwordField.setValue(password);
        thresholdField.setValue(threshold);
    }

    public void saveSettings() {
        saveButton.click();
    }

    public void deleteCompany() {
        deleteButton.click();
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.TextBoxResultsComponents;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    private SelenideElement fullNameInput = $("[id=userName]"),
            userEmailInput = $("[id=userEmail]"),
            currentAddressInput = $("[id=currentAddress]"),
            permanentAddressInput = $("[id=permanentAddress]"),
            submitInput = $("[id=submit]");

    TextBoxResultsComponents textBoxResultsComponents = new TextBoxResultsComponents();

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxPage setFulltName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage submitForm() {
        submitInput.click();

        return this;
    }

    public TextBoxPage checkResults (String key, String value) {
        textBoxResultsComponents.checkResults(key, value);

        return this;
    }
}

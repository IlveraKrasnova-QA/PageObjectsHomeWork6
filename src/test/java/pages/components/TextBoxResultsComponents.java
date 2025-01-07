package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxResultsComponents {

    public void checkResults (String key, String value) {
        $("[id=output]").$(byText(key)).parent().shouldHave(text(value));
    }
}

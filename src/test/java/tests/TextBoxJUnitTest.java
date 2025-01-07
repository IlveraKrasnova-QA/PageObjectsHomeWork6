package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxJUnitTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successfulTextBoxJUnitTest() {
        textBoxPage.openPage()
                .setFulltName("Kate Black")
                .setEmail("kb@b.com")
                .setCurrentAddress("Illinois, Chicago")
                .setPermanentAddress("Illinois, Buffalo Grove")
                .submitForm()
                .checkResults("Name:", "Kate Black")
                .checkResults("Email:", "kb@b.com")
                .checkResults("Current Address :", "Illinois, Chicago")
                .checkResults("Permananet Address :", "Illinois, Buffalo Grove");
    }

}

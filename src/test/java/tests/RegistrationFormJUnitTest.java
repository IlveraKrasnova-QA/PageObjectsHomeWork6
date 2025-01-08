package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;


public class RegistrationFormJUnitTest extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();


    @Test
    void successfulRegistrationFormJUnitTest() {
        registrationFormPage.openPage()
                .removeBanner()
                .setFirstName("kotechka")
                .setLastName("kotova")
                .setUserEmail("k@kt.com")
                .setGender()
                .setUserNumber("0001111213")
                .setDateOfBirth("02", "February", "1999")
                .setHobbies()
                .setSubject("Arts")
                .uploadPicture("photo_2024-11-25 16.43.04.jpg")
                .setCurrentAddress("Moscow")
                .setState("NCR")
                .setCity("Noida")
                .submitForm()
                .checkResults("Student Name", "kotechka kotova")
                .checkResults("Student Email", "k@kt.com")
                .checkResults("Gender", "Female")
                .checkResults("Mobile", "0001111213")
                .checkResults("Date of Birth", "02 February,1999")
                .checkResults("Subjects", "Arts")
                .checkResults("Hobbies", "Music")
                .checkResults("Picture", "photo_2024-11-25 16.43.04.jpg")
                .checkResults("Address", "Moscow")
                .checkResults("State and City", "NCR Noida");
    }

    @Test
    void minimumAmountOfInformationForRegistrationJUnitTest() {
        registrationFormPage.openPage()
                .removeBanner()
                .setFirstName("kotechka")
                .setLastName("kotova")
                .setGender()
                .setUserNumber("0001111213")
                .submitForm()
                .checkResults("Student Name", "kotechka kotova")
                .checkResults("Gender", "Female")
                .checkResults("Mobile", "0001111213");
    }

    @Test
    void negativeCheckJUnitTest() {
        registrationFormPage.openPage()
                .removeBanner()
                .setFirstName("kotechka")
                .setLastName("kotova")
                .setGender()
                .setUserNumber("asdfghjklp")
                .submitForm()
                .responseTable()
                .setUserNumber("0001111213")
                .submitForm()
                .checkResults("Student Name", "kotechka kotova")
                .checkResults("Gender", "Female")
                .checkResults("Mobile", "0001111213");

    }
}
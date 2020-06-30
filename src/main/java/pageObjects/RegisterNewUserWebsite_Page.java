package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

import java.io.IOException;

public class RegisterNewUserWebsite_Page extends BasePage {
    //Constructor
    public RegisterNewUserWebsite_Page() throws IOException {
    }

    @FindBy (css = "div.btn") WebElement kontoDropDownmenu;
    @FindBy(xpath = "/html/body/div[2]/div/div/button") WebElement zgadzamSie;
    @FindBy(xpath = "/html/body/div[1]/header/section/nav[2]/ul/li/div/div[2]/div/nav/ul/li[2]/a") WebElement rejestracjaButton;
    @FindBy(xpath = "//*[@id=\"register-step-2\"]") WebElement emailButton;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[1]/div[2]/input") WebElement emailField;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[1]/div[3]/input") WebElement passwordField;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[1]/div[4]/div/ul/li/label/span") WebElement checkBoxButton;
    @FindBy(xpath = "//*[@id=\"register-next-step\"]") WebElement dalej1Button;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[2]/div[1]/input") WebElement imieField;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[2]/div[2]/input") WebElement nazwiskoField;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[2]/div[3]/input") WebElement telefonField;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[2]/div[5]/div[1]/ul/li[1]/label") WebElement over16Checkbox;
    @FindBy(xpath = "//*[@id=\"register-thrd-step\"]") WebElement dalej2Button;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/form/div[3]/div[1]/div[1]/ul/li[1]/label/span") WebElement allPermisionsButton;
    @FindBy(xpath = "//*[@id=\"form-register-submit-with-agreements\"]") WebElement rejestrujButton;
    @FindBy(xpath = "/html/body/aside[6]/div[1]/div/div/div[1]/div/div[2]/div[1]/p[2]") WebElement aktywacjaMessage;


    //Scenario
    public RegisterNewUserWebsite_Page user_navigate_to_Multikino_Website() throws Exception {
        driver.get("https://multikino.pl/");
        waitAndClickElement(zgadzamSie);
        Thread.sleep(5000);

        return new RegisterNewUserWebsite_Page();
    }

    public RegisterNewUserWebsite_Page user_navigate_to_KONTO_dropdownmenu_in_topMenu() throws Exception {
        waitAndClickElement(kontoDropDownmenu);
        Thread.sleep(3000);

        return new RegisterNewUserWebsite_Page();
    }

    public RegisterNewUserWebsite_Page click_on_REJESTRACJA_button() throws Exception {
        waitAndClickElement(rejestracjaButton);
        Thread.sleep(5000);
        return new RegisterNewUserWebsite_Page();
    }

    public RegisterNewUserWebsite_Page user_click_on_Email_button_in_side_bar_menu() throws Exception {
        waitAndClickElement(emailButton);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_enter_existing_email(String email) throws Exception {
        sendKeysToWebElement(emailField, email);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }

    public RegisterNewUserWebsite_Page enter_password_(String password) throws Throwable {
        sendKeysToWebElement(passwordField, password);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_on_checkbox_with_accepting_regulations() throws Exception {
        waitAndClickElement(checkBoxButton);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_Dalej1_button() throws Exception {
        waitAndClickElement(dalej1Button);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_write_Name_and_Surname(String name, String surname) throws Exception {
        sendKeysToWebElement(imieField, name);
        sendKeysToWebElement(nazwiskoField, surname);
        Thread.sleep(5000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page write_phone_number(String number) throws Exception {
        sendKeysToWebElement(telefonField, number);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_on_checkbox_that_he_she_over() throws Exception {
        waitAndClickElement(over16Checkbox);
        Thread.sleep(3000);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_on_Dalej2_button() throws Exception {
        waitAndClickElement(dalej2Button);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_on_first_checkbox_that_he_give_all_permissions() throws Exception {
        waitAndClickElement(allPermisionsButton);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page user_click_on_Zarejestruj_button() throws Exception {
        // I just dont want to register fake accounts on website
        //waitAndClickElement(rejestrujButton);
        return new RegisterNewUserWebsite_Page();
    }


    public RegisterNewUserWebsite_Page email_with_confirmation_of_registration_should_be_successfully_sended() throws Exception {
        String expectedMessage = "wysłaliśmy wiadomość zawierającą link potwierdzający założenie konta.";
        String actualMessage = aktywacjaMessage.toString();
        AssertJUnit.assertEquals(expectedMessage, actualMessage);
        return new RegisterNewUserWebsite_Page();
    }






}

package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class RegisterNewUser_website_steps extends DriverFactory {

    @Given("^User navigate to Multikino Website$")
    public void user_navigate_to_Multikino_Website() throws Throwable {
        registerNewUserWebsite_page.user_navigate_to_Multikino_Website();
    }

    @When("^User navigate to KONTO dropdownmenu in topMenu$")
    public void user_navigate_to_KONTO_dropdownmenu_in_topMenu() throws Throwable {
        registerNewUserWebsite_page.user_navigate_to_KONTO_dropdownmenu_in_topMenu();
    }

    @When("^click on REJESTRACJA button$")
    public void click_on_REJESTRACJA_button() throws Throwable {
        registerNewUserWebsite_page.click_on_REJESTRACJA_button();
    }

    @Then("^User click on Email button in side bar menu$")
    public void user_click_on_Email_button_in_side_bar_menu() throws Throwable {
        registerNewUserWebsite_page.user_click_on_Email_button_in_side_bar_menu();
    }

    @When("^User enter existing email \"([^\"]*)\"$")
    public void user_enter_existing_email(String email) throws Throwable {
        registerNewUserWebsite_page.user_enter_existing_email(email);
    }

    @When("^enter password \"([^\"]*)\"$")
    public void enter_password(String password) throws Throwable {
        registerNewUserWebsite_page.enter_password_(password);
    }

    @When("^User click on checkbox with accepting regulations$")
    public void user_click_on_checkbox_with_accepting_regulations() throws Throwable {
        registerNewUserWebsite_page.user_click_on_checkbox_with_accepting_regulations();
    }

    @Then("^User click Dalej button$")
    public void user_click_Dalej_button() throws Throwable {
        registerNewUserWebsite_page.user_click_Dalej1_button();
    }

    @When("^User write Name \"([^\"]*)\" and Surname \"([^\"]*)\"$")
    public void user_write_Name_and_Surname(String name, String surname) throws Throwable {
        registerNewUserWebsite_page.user_write_Name_and_Surname(name, surname);
    }

    @When("^write phone number \"([^\"]*)\"$")
    public void write_phone_number(String number) throws Throwable {
        registerNewUserWebsite_page.write_phone_number(number);
    }

    @When("^User click on checkbox that he/she over sixteen$")
    public void user_click_on_checkbox_that_he_she_over_sixteen() throws Throwable {
        registerNewUserWebsite_page.user_click_on_checkbox_that_he_she_over();
    }

    @Then("^User click on Dalej button$")
    public void user_click_on_Dalej_button() throws Throwable {
        registerNewUserWebsite_page.user_click_on_Dalej2_button();
    }

    @When("^User click on first checkbox that he give all permissions$")
    public void user_click_on_first_checkbox_that_he_give_all_permissions() throws Throwable {
        registerNewUserWebsite_page.user_click_on_first_checkbox_that_he_give_all_permissions();
    }

    @When("^User click on Zarejestruj button$")
    public void user_click_on_Zarejestruj_button() throws Throwable {
        registerNewUserWebsite_page.user_click_on_Zarejestruj_button();
    }

    @Then("^Email with confirmation of registration should be successfully sended$")
    public void email_with_confirmation_of_registration_should_be_successfully_sended() throws Throwable {
        registerNewUserWebsite_page.email_with_confirmation_of_registration_should_be_successfully_sended();
    }





}

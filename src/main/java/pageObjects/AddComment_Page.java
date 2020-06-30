package pageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

import java.io.IOException;

import static org.testng.AssertJUnit.*;

public class AddComment_Page extends BasePage {
    @FindBy(xpath = "//div[@class='btn btn--menu-nav profile-link']") WebElement kontoDropDownmenu;
    @FindBy(xpath = "//button[@data-js='closeCookies']") WebElement zgadzamSie;
    @FindBy(xpath = "/html/body/div[1]/header/section/nav[2]/ul/li/div/div[2]/div/nav/ul/li[1]/a") WebElement logowanieButton;
    @FindBy(xpath = "//button[@type='submit'][@form='form-login']") WebElement zalogujButton;
    @FindBy(xpath = "//button[@data-js='login-by-email']") WebElement emailButton;
    @FindBy(xpath = "//input[@type='email'][@name='email']") WebElement emailField;
    @FindBy(xpath = "//input[@type='password'][@name='password']") WebElement passwordField;
    @FindBy(xpath = "//div[@class='ml-movie-boxes__shadow']") WebElement anyMoviePicture;
    @FindBy(xpath = "//button[@data-js='btn-comments']\n") WebElement komentujButton;
    @FindBy(xpath = " //textarea[@id='#'][@name='comment']") WebElement textArea;
    @FindBy(xpath = "//button[@type='submit']") WebElement publishButton;

    public AddComment_Page() throws IOException {
    }


    public AddComment_Page home_page_of_Multikino_is_opened() throws Exception {
        driver.get("https://multikino.pl/");
        waitAndClickElement(zgadzamSie);
        Thread.sleep(5000);
        return new AddComment_Page();
    }


    public AddComment_Page user_is_logged_in() throws Exception {
        waitAndClickElement(kontoDropDownmenu);
        waitAndClickElement(logowanieButton);
        waitAndClickElement(emailButton);
        sendKeysToWebElement(emailField, "sikor999@op.pl");
        sendKeysToWebElement(passwordField, "Qwerty12345");
        waitAndClickElement(zalogujButton);
        return new AddComment_Page();
    }


    public AddComment_Page page_with_first_available_movie_from_repertoire_is_opened() throws Exception {
        scrollToElementByWebElementLocator(anyMoviePicture);
        waitAndClickElement(anyMoviePicture);
        return new AddComment_Page();
    }


    public AddComment_Page button_comment_is_clicked() throws Exception {
        waitAndClickElement(komentujButton);
        return new AddComment_Page();
    }


    public AddComment_Page user_enter_comment(String comment) throws Exception {
        sendKeysToWebElement(textArea, comment);
        return new AddComment_Page();
    }


    public AddComment_Page user_clicks_on_publish_button() throws Exception {

        waitAndClickElement(publishButton);
        return new AddComment_Page();

    }


    public AddComment_Page comment_should_be_added_and_visible(String comment) throws Exception {
        WebElement newPost1 = driver.findElement(By.xpath("//div[@class='ml-comment-box__comment-list__content']//p[contains(text(),'Bardzo fajny film! Polecam gorąco! ')]"));
        WebElement newPost2 = driver.findElement(By.xpath("//div[@class='ml-comment-box__comment-list__content']//p[contains(text(),'I like it 123!@# a movie!')]"));

        if (newPost1.isDisplayed()){
            AssertJUnit.assertEquals(newPost1.getText(), comment);
            System.out.println("Comment1 added and visible");
        }else if (newPost2.isDisplayed()){
            AssertJUnit.assertEquals(newPost2.getText(), comment);
            System.out.println("Comment2 added and visible");
        } else {
            Assert.fail("Comment not added or not visible");
        }











}

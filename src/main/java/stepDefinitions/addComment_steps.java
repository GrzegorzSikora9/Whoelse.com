package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class addComment_steps extends DriverFactory {
    @Given("^Home page of Multikino is opened$")
    public void home_page_of_Multikino_is_opened() throws Throwable {
        addcomment_page.home_page_of_Multikino_is_opened();
    }

    @Given("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
        addcomment_page.user_is_logged_in();
    }

    @Given("^Page with first available movie from repertoire is opened$")
    public void page_with_first_available_movie_from_repertoire_is_opened() throws Throwable {
        addcomment_page.page_with_first_available_movie_from_repertoire_is_opened();
    }

    @Given("^Button comment is clicked$")
    public void button_comment_is_clicked() throws Throwable {
        addcomment_page.button_comment_is_clicked();
    }

    @When("^User enter \"([^\"]*)\" comment$")
    public void user_enter_comment(String comment) throws Throwable {
        addcomment_page.user_enter_comment(comment);
    }

    @When("^User clicks on publish button$")
    public void user_clicks_on_publish_button() throws Throwable {
        addcomment_page.user_clicks_on_publish_button();
    }

    @Then("^Comment \"([^\"]*)\" should be added and visible$")
    public void comment_should_be_added_and_visible(String comment) throws Throwable {
        addcomment_page.comment_should_be_added_and_visible(comment);
    }



}

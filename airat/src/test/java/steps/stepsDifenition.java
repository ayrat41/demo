package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class stepsDefinition {
    @Given("^User open the browser$")
    public void user_open_the_browser() throws Throwable {
    }

    @When("^User navigtes to https://www\\.google\\.com$")
    public void user_navigtes_to_https_www_google_com() throws Throwable {
    }

    @Then("^Home page is open and \"([^\"]*)\" title is displayed$")
    public void home_page_is_open_and_title_is_displayed(String arg1) throws Throwable {
    }
}

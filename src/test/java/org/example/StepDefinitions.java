package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/aliee/OneDrive/Desktop/Github/New%20folder/Testing-Env/index.html");
    }

    @When("I click on enrollment button")
    public void i_click_on_enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @After
    public void cleanUp() {
        driver.quit();

    }

    @When("I click on hybrid button")
    public void I_click_on_hybrid_button() {
        Utils.scrollToElement(driver, mainPage.getHybridHeader());
        mainPage.ClickOnHybridButton();
    }

    @Then("the page should start with {string}")
    public void the_page_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @When("I click on In page button")
    public void i_click_on_in_page_button() {
        Utils.scrollToElement(driver, mainPage.getHybridHeader());
        mainPage.ClickOnInPageButton();
    }

    @Given("I'm on john Doe's page")
    public void i_m_on_john_doe_s_page() {

    }

    @When("I click on twitter icon")
    public void i_click_on_twitter_icon() {
        Utils.scrollToElement(driver, mainPage.getOurInstructorsHeader());
        mainPage.setClickOnTwitterIcon();
    }

    @Then("twitter page is opened")
    public void twitter_page_is_opened() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("twitter"));
    }

    @When("I click on the Question button")
    public void i_click_on_the_questions_button() {
        mainPage.clickOnTheQuestionButton();
    }

    @Then("The main page scroll down to Frequently Asked Questions")
    public void the_main_page_Scroll_down_to_frequently_asked_questions() {

    }

    @Then("I click on the How much does it cost to attend? Question")
    public void i_click_on_how_much_does_it_cost_to_attend_question() {
        Utils.scrollToElement(driver, mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnHowMuchDoesItCostToAttendButton();
    }

    @Then("The answer appear below the question")
    public void the_answer_appear_below_theQuestion() {

    }

    @Then("The maine page scroll down to Frequently Asked Questions")
    public void the_maine_page_scroll_down_to_frequently_asked_questions() {
        Assert.assertEquals("Frequently Asked Questions", mainPage.getFaqHeaderText());
    }

    @Then("I click on the How much does cost to attend? Question")
    public void i_click_on_the_how_much_does_cost_to_attend_question() {
        Utils.scrollToElement(driver, mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnHowMuchDoesItCostToAttendButton();
    }

    @Then("I click on the Where is your institution located? Question")
    public void i_click_on_the_where_is_your_institution_located_question () {
        Utils.scrollToElement(driver, mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnWhereIsYourInstitutionLocated();
    }
    @Then("I click on the What do I need to know before hand? Question")
    public void i_click_on_the_what_do_i_need_to_know_before_hand_question() {
        Utils.scrollToElement(driver, mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnWhatDoINeedToKnowBeforeHand();

    @After
    public void CloseBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }

    }
}

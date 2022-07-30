package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
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
        Utils.scrollToElement(driver, mainPage.getTwitterIcon());
        mainPage.clickOntwitterIcon();
    }
    @Then("twitter page is opened")
    public void twitter_page_is_opened() {

    }
}
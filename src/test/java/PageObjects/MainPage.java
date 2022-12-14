package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]")
    private WebElement clickOnTwitterIcon;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement faqHeader;




    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnEnrollmentButton() {
        this.enrollmentButton.click();
    }
    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement InPersonButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement twitterIcon;

    @FindBy(xpath="//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement submitQuestionButton;

    @FindBy(xpath="//*[@id=\"questions\"]/div/h2")
    private WebElement scrollToFrequentlyAskedQuestions;

    @FindBy(xpath="//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement howMuchDoesItCostToAttendButton;

    @FindBy(xpath ="//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement WhereIsYourInstitutionLocated;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement ourInstructorsHeader;

    @FindBy(xpath ="//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement WhatDoINeedToKnowBeforeHand;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement whereIsYourInstitutionLocated;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement whatDoINeedToKnowBeforeHand;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement howDoISignedUp;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[5]/h3/button")
    private WebElement willYourOrganisationHelpMeFindAJob;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[2]/i")
    private WebElement facebookIcon;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[4]/i")
    private WebElement instagramIcon;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[4]/div/div/a[3]/i")
    private WebElement linkedinIcon;

    public void ClickOnHybridButton(){
        this.hybridButton.click();
    }

    public WebElement getHybridHeader() {
        return this.hybridHeader;
    }

    public void ClickOnInPageButton() {this.InPersonButton.click();}
    

    public void setClickOnTwitterIcon() { this.clickOnTwitterIcon.click();
    }

    public WebElement getTwitterIcon() {
        return twitterIcon;
    }
    public void clickOnTheQuestionButton(){this.submitQuestionButton.click();
    }
    public void clickOnHowDoISignedUp() {this.howDoISignedUp.click();
    }
    public WebElement getScrollToFrequentlyAskedQuestions(){return this.scrollToFrequentlyAskedQuestions;
    }
    public void clickOnHowMuchDoesItCostToAttendButton(){this.howMuchDoesItCostToAttendButton.click();
    }
    public String getFaqHeaderText() {
        return this.faqHeader.getText();
    }
    public void clickOnWhereIsYourInstitutionLocated() { this.whereIsYourInstitutionLocated.click(); }
    public void clickOnWhatDoINeedToKnowBeforeHand() { this.whatDoINeedToKnowBeforeHand.click(); }

    public void clickOnWillYourOrganisationHelpMeFindAJob() { this.willYourOrganisationHelpMeFindAJob.click(); }

    public void setClickOnFacebookIcon() { facebookIcon.click();}

    public void setClickOnInstagramIcon() {instagramIcon.click();}

    public void setClickOnLinkedInIcon() {linkedinIcon.click();}


    public WebElement getOurInstructorsHeader() {
        return this.ourInstructorsHeader;
    }


}









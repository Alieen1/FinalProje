package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class MainPage {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;
    private HTMLInputElement clickOnTwitterIcon;
    private HTMLInputElement clickOntwitterIcon;

    public MainPage(WebDriver driver) {
        driver.manage().window().maximize();
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


    public void ClickOnHybridButton(){
        this.hybridButton.click();
    }

    public WebElement getHybridHeader() {
        return this.hybridHeader;
    }

    public void ClickOnInPageButton() {this.InPersonButton.click();}
    

    public void clickOntwitterIcon() { this.clickOnTwitterIcon.click();
    }

    public WebElement getTwitterIcon() {
        return twitterIcon;
    }


}









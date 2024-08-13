package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage implements IConstants {

    @FindBy(xpath = "//button[normalize-space()='Click for JS Alert']")
    WebElement alertTypeButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement alertTypeResultMessage;
    @FindBy(xpath = "//button[normalize-space()='Click for JS Confirm']")
    WebElement confirmTypeButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement confirmTypeAcceptResultMessage;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement confirmTypeDeclineResultMessage;
    @FindBy(xpath = "//button[normalize-space()='Click for JS Prompt']")
    WebElement promptTypeButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement promptTypeResultMessage;

    /**
     * Instantiates a new Alert page.
     *
     * @param driver the driver
     */
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page alert page.
     *
     * @return the alert page
     */
    public AlertPage openPage(){
        driver.get(ALERTS_PAGE_URL);
        return this;
    }

    /**
     * Call js alert alert page.
     *
     * @return the alert page
     */
    public AlertPage clickJSAllertButton(){
        alertTypeButton.click();
        return this;
    }

    /**
     * Accept js alert alert page.
     *
     * @return the alert page
     */
    public AlertPage acceptJsAlertType(){
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Get js alert message text string.
     *
     * @return the string
     */
    public String getJsAlertTypeMessageText(){
        return alertTypeResultMessage.getText();
    }

    /**
     * Call js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage clickJSConfirmTypeButton(){
        confirmTypeButton.click();
        return this;
    }

    /**
     * Accept js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage acceptJsConfirmType(){
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Decline js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage declineJsConfirmType(){
        driver.switchTo().alert().dismiss();
        return this;
    }

    /**
     * Get js accept confirm message text string.
     *
     * @return the string
     */
    public String getJsAcceptTypeConfirmMessageText(){
        return confirmTypeAcceptResultMessage.getText();
    }

    /**
     * Get js decline confirm message text string.
     *
     * @return the string
     */
    public String getJsDeclineConfirmTypeMessageText(){
        return confirmTypeDeclineResultMessage.getText();
    }

    /**
     * Call js prompt alert page.
     *
     * @return the alert page
     */
    public AlertPage clickJSPromptTypeButton(){
        promptTypeButton.click();
        return this;
    }

    /**
     * Confirm js prompt alert page.
     *
     * @param text the text
     * @return the alert page
     */
    public AlertPage confirmJsPromptType(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Get js prompt message text string.
     *
     * @return the string
     */
    public String getJsPromptTypeMessageText(){
        return promptTypeResultMessage.getText();
    }
}

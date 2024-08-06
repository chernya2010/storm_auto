package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage implements IConstants {

    @FindBy(xpath = "//button[normalize-space()='Click for JS Alert']")
    WebElement alertButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement alertResultMessage;
    @FindBy(xpath = "//button[normalize-space()='Click for JS Confirm']")
    WebElement confirmButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement confirmAcceptResultMessage;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement confirmDeclineResultMessage;
    @FindBy(xpath = "//button[normalize-space()='Click for JS Prompt']")
    WebElement promptButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement promptResultMessage;

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
    public AlertPage callJsAlert(){
        alertButton.click();
        return this;
    }

    /**
     * Accept js alert alert page.
     *
     * @return the alert page
     */
    public AlertPage acceptJsAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Get js alert message text string.
     *
     * @return the string
     */
    public String getJsAlertMessageText(){
        return alertResultMessage.getText();
    }
/////////////////////
    /**
     * Call js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage callJsConfirm(){
        confirmButton.click();
        return this;
    }

    /**
     * Accept js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage acceptJsConfirm(){
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Decline js confirm alert page.
     *
     * @return the alert page
     */
    public AlertPage declineJsConfirm(){
        driver.switchTo().alert().dismiss();
        return this;
    }

    /**
     * Get js accept confirm message text string.
     *
     * @return the string
     */
    public String getJsAcceptConfirmMessageText(){
        return confirmAcceptResultMessage.getText();
    }

    /**
     * Get js decline confirm message text string.
     *
     * @return the string
     */
    public String getJsDeclineConfirmMessageText(){
        return confirmDeclineResultMessage.getText();
    }
////////////////////
    /**
     * Call js prompt alert page.
     *
     * @return the alert page
     */
    public AlertPage callJsPrompt(){
        promptButton.click();
        return this;
    }

    /**
     * Confirm js prompt alert page.
     *
     * @param text the text
     * @return the alert page
     */
    public AlertPage confirmJsPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return this;
    }

    /**
     * Get js prompt message text string.
     *
     * @return the string
     */
    public String getJsPromptMessageText(){
        return promptResultMessage.getText();
    }
}

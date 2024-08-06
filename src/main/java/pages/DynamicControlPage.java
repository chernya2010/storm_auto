package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicControlPage extends BasePage implements IConstants {

    public static final String CHECKBOX = "[id='checkbox-example']";
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addCheckboxButton;
    @FindBy(xpath = "//button[normalize-space()='Remove']")
    WebElement removeCheckboxButton;
    @FindBy(xpath = "//input[@type='text']")
    WebElement inputField;
    @FindBy(xpath = "//button[normalize-space()='Enable']")
    WebElement enableInputButton;
    @FindBy(xpath = "//button[normalize-space()='Disable']")
    WebElement disableInputButton;
    @FindBy(xpath = "//p[@id='message']")
    public WebElement checkboxMessage;
    @FindBy(xpath = "//p[@id='message']")
    public WebElement inputFieldMessage;

    /**
     * Instantiates a new Dynamic control page.
     *
     * @param driver the driver
     */
    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page dynamic control page.
     *
     * @return the dynamic control page
     */
    public DynamicControlPage openPage(){
        driver.get(DYNAMIC_CONTRILS_PAGE_URL);
        return this;
    }

    /**
     * Is checkbox visible boolean.
     *
     * @return the boolean
     */
    public boolean isCheckboxVisible(){
        List<WebElement> checkboxesList = driver.findElements(By.id(CHECKBOX));
        return checkboxesList.isEmpty();
    }

    /**
     * Add checkbox.
     */
    public DynamicControlPage addCheckbox(){
        addCheckboxButton.click();
        return this;
    }

    /**
     * Remove checkbox.
     */
    public DynamicControlPage removeCheckbox(){
        removeCheckboxButton.click();
        return this;
    }

    /**
     * Get checkbox message string.
     *
     * @return the string
     */
    public String getCheckboxMessage(){
        return checkboxMessage.getText();
    }

    /**
     * Is input enable boolean.
     *
     * @return the boolean
     */
    public boolean isInputEnable(){
        return inputField.isEnabled();
    }

    /**
     * Enable input field.
     */
    public DynamicControlPage enableInputField(){
        enableInputButton.click();
        return this;
    }

    /**
     * Disable input field.
     */
    public DynamicControlPage disableInputField(){
        disableInputButton.click();
        return this;
    }

    /**
     * Get input field message string.
     *
     * @return the string
     */
    public String getInputFieldMessage(){
        return inputFieldMessage.getText();
    }
}

package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage implements IConstants {

    @FindBy(xpath = "//div[@id='hot-spot']")
    WebElement alertArea;

    /**
     * Instantiates a new Context menu page.
     *
     * @param driver the driver
     */
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page context menu page.
     *
     * @return the context menu page
     */
    public ContextMenuPage openPage(){
        driver.get(CONTEXT_MENU_PAGE_URL);
        return this;
    }

    /**
     * Call allert message.
     */
    public ContextMenuPage callAllertMessage(){
        Actions action = new Actions(driver);
        action.contextClick(alertArea).perform();
        return this;
    }

    /**
     * Get alert message text string.
     *
     * @return the string
     */
    public String getAlertMessageText(){
        return driver.switchTo().alert().getText();
    }

    /**
     * Close alert message.
     */
    public ContextMenuPage closeAlertMessage(){
        driver.switchTo().alert().accept();
        return this;
    }
}

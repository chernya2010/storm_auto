package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage implements IConstants {

    @FindBy(xpath = "//div[@id='column-a']")
    WebElement elementA;
    @FindBy(xpath = "//div[@id='column-b']")
    WebElement elementB;

    /**
     * Instantiates a new Drag and drop page.
     *
     * @param driver the driver
     */
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page drag and drop page.
     *
     * @return the drag and drop page
     */
    public DragAndDropPage openPage(){
        driver.get(DRAG_AND_DROP_PAGE_URL);
        return this;
    }

    /**
     * Drag and drop element a on element b drag and drop page.
     *
     * @param elementA the element a
     * @param elementB the element b
     * @return the drag and drop page
     */
    public DragAndDropPage dragAndDropElementAOnElementB(WebElement elementA, WebElement elementB){
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(elementA)
                .moveToElement(elementB)
                .release(elementB)
                .build();
        dragAndDrop.perform();
        return this;
    }
}

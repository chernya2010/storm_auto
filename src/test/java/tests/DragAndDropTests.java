package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends BaseTest{
    @FindBy(xpath = "//div[@id='column-a']")
    WebElement elementA;
    @FindBy(xpath = "//div[@id='column-b']")
    WebElement elementB;


    /**
     * Drag and drop element a on element b test.
     */
    @Test
    public void dragAndDropElementAOnElementBTest(){
        dragAndDropPage
                .openPage()
                .dragAndDropElementAOnElementB(elementA, elementB);
        Assert.assertEquals(elementA.getText(), "B");
        driver.close();
    }
}

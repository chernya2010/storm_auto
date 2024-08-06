package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicControlTests extends BaseTest{
    private static final String CHECKBOX_SUCCESS_ADD_MESSAGE_TEXT = "It's back!";
    private static final String CHECKBOX_SUCCESS_REMOVE_MESSAGE_TEXT = "It's gone!";
    private static final String INPUT_FIELD_ENABLE_MESSAGE_TEXT = "It's enabled!";
    private static final String INPUT_FIELD_DISABLE_MESSAGE_TEXT = "It's disabled!";

    /**
     * Dynamic controls test.
     */
    @Test
    public void dynamicControlsTest(){
        dynamicControlPage
                .openPage()
                .removeCheckbox();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.checkboxMessage));
        Assert.assertEquals(CHECKBOX_SUCCESS_REMOVE_MESSAGE_TEXT, dynamicControlPage.getCheckboxMessage());
        Assert.assertTrue(dynamicControlPage.isCheckboxVisible());
        Assert.assertFalse(dynamicControlPage.isInputEnable());
        dynamicControlPage.enableInputField();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.inputFieldMessage));
        Assert.assertEquals(INPUT_FIELD_ENABLE_MESSAGE_TEXT, dynamicControlPage.getInputFieldMessage());
        Assert.assertTrue(dynamicControlPage.isInputEnable());
        driver.close();
    }
}

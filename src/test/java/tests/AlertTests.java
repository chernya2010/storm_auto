package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTest {
    private static final String JS_ALERT_TYPE_SUCCESS_TEXT = "You successfully clicked an alert";
    private static final String JS_CONFIRM_TYPE_SUCCESS_TEXT = "You clicked: Ok";
    private static final String JS_CONFIRM_TYPE_DECLINE_TEXT = "You clicked: Cancel";
    private static final String JS_PROMPT_TYPE_SUCCESS_TEXT = "You entered: Text";

    /**
     * Check js alert test.
     */
    @Test
    public void checkJsAlertTypeTest(){
        alertPage
                .openPage()
                .clickJSAllertButton()
                .acceptJsAlertType();
        Assert.assertEquals(JS_ALERT_TYPE_SUCCESS_TEXT, alertPage.getJsAlertTypeMessageText());
        driver.close();
    }

    /**
     * Check js confirm decline test.
     */
    @Test
    public void checkJsConfirmTypeDeclineTest(){
        alertPage
                .openPage()
                .clickJSConfirmTypeButton()
                .declineJsConfirmType();
        Assert.assertEquals(JS_CONFIRM_TYPE_DECLINE_TEXT, alertPage.getJsDeclineConfirmTypeMessageText());
        driver.close();
    }

    /**
     * Check js prompt accept test.
     */
    @Test
    public void checkJsPromptTypeAcceptTest(){
        alertPage
                .openPage()
                .clickJSPromptTypeButton()
                .confirmJsPromptType("Text");
        Assert.assertEquals(JS_PROMPT_TYPE_SUCCESS_TEXT, alertPage.getJsPromptTypeMessageText());
        driver.close();
    }
}

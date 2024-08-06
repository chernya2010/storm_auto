package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTest {
    private static final String JS_ALERT_SUCCESS_TEXT = "You successfully clicked an alert";
    private static final String JS_CONFIRM_SUCCESS_TEXT = "You clicked: Ok";
    private static final String JS_CONFIRM_DECLINE_TEXT = "You clicked: Cancel";
    private static final String JS_PROMPT_SUCCESS_TEXT = "You entered: Text";

    /**
     * Check js alert test.
     */
    @Test
    public void checkJsAlertTest(){
        alertPage
                .openPage()
                .callJsAlert()
                .acceptJsAlert();
        Assert.assertEquals(JS_ALERT_SUCCESS_TEXT, alertPage.getJsAlertMessageText());
        driver.close();
    }

    /**
     * Check js confirm decline test.
     */
    @Test
    public void checkJsConfirmDeclineTest(){
        alertPage
                .openPage()
                .callJsConfirm()
                .declineJsConfirm();
        Assert.assertEquals(JS_CONFIRM_DECLINE_TEXT, alertPage.getJsDeclineConfirmMessageText());
        driver.close();
    }

    /**
     * Check js prompt accept test.
     */
    @Test
    public void checkJsPromptAcceptTest(){
        alertPage
                .openPage()
                .callJsPrompt()
                .confirmJsPrompt("Text");
        Assert.assertEquals(JS_PROMPT_SUCCESS_TEXT, alertPage.getJsPromptMessageText());
        driver.close();
    }
}

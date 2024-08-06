package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest{
    private static final String ALERT_MESSAGE_TEXT = "You selected a context menu";

    /**
     * Check alert message text test.
     */
    @Test
    public void checkAlertMessageTextTest(){
        contextMenuPage
                .openPage()
                .callAllertMessage();
        Assert.assertEquals(ALERT_MESSAGE_TEXT, contextMenuPage.getAlertMessageText());
        contextMenuPage
                .closeAlertMessage();
        driver.close();
    }
}

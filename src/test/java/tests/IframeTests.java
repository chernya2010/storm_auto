package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTests extends BaseTest{
    private static final String IFRAME_TEXT = "This is a sample page";

    /**
     * Check text inside iframe test.
     */
    @Test
    public void checkTextInsideIframeTest(){
        iframePage
                .openPage()
                .openIframe();
        Assert.assertEquals(IFRAME_TEXT, iframePage.getIframeText());
        driver.close();
    }
}
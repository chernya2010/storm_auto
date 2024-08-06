package tests;

import org.testng.annotations.Test;

public class JsExecutorTests extends BaseTest{
    private static final String SCROLL_TO_ELEMENT_LOCATOR = "//a[normalize-space()='Multiple Windows']";

    /**
     * Scroll page test.
     */
    @Test
    public void scrollPageTest(){
        jsExecutorPage
                .openPage()
                .scrollPageByNumberOfPixels()
                .scrollPageToSpecificElement(SCROLL_TO_ELEMENT_LOCATOR)
                .scrollPageToTheBottom()
                .scrollPageToTheTop();
        driver.close();
    }
}

package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsExecutorPage extends BasePage implements IConstants {

    /**
     * Instantiates a new Js executor page.
     *
     * @param driver the driver
     */
    public JsExecutorPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page js executor page.
     *
     * @return the js executor page
     */
    public JsExecutorPage openPage(){
        driver.get(BASE_URL);
        return this;
    }

    /**
     * Scroll page by number of pixels js executor page.
     *
     * @return the js executor page
     */
    public JsExecutorPage scrollPageByNumberOfPixels(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)");
        return this;
    }

    /**
     * Scroll page to specific element js executor page.
     *
     * @param locator the locator
     * @return the js executor page
     */
    public JsExecutorPage scrollPageToSpecificElement(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    /**
     * Scroll page to the top js executor page.
     *
     * @return the js executor page
     */
    public JsExecutorPage scrollPageToTheTop(){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        return this;
    }

    /**
     * Scroll page to the bottom js executor page.
     *
     * @return the js executor page
     */
    public JsExecutorPage scrollPageToTheBottom(){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0,document.body.scrollHeight)");
        return this;
    }
}
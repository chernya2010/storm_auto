package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage implements IConstants {

    @FindBy(xpath = "//iframe[@id='frame1']")
    WebElement iframe;
    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement iframeText;

    /**
     * Instantiates a new Iframe page.
     *
     * @param driver the driver
     */
    public IframePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page iframe page.
     *
     * @return the iframe page
     */
    public IframePage openPage(){
        driver.get(FRAMES_PAGE_URL);
        return this;
    }

    /**
     * Open iframe iframe page.
     *
     * @return the iframe page
     */
    public IframePage openIframe(){
       driver.switchTo().frame(iframe);
       return this;
    }

    /**
     * Close iframe iframe page.
     *
     * @return the iframe page
     */
    public IframePage closeIframe(){
        driver.switchTo().defaultContent();
        return this;
    }

    /**
     * Get iframe text string.
     *
     * @return the string
     */
    public String getIframeText(){
        return iframeText.getText();
    }
}

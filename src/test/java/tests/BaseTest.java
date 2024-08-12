package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.HashMap;


public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlPage dynamicControlPage;
    FileUploadPage fileUploadPage;
    IframePage iframePage;
    AlertPage alertPage;
    JsExecutorPage jsExecutorPage;
    DragAndDropPage dragAndDropPage;
    FileDownloadPage fileDownloadPage;

    /**
     * Init test.
     */
    @BeforeMethod
    public void initTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        initPages();
        PageFactory.initElements(driver, this);
        WebDriverManager.chromedriver().setup();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        System.setProperty("user.dir", "D:/Stormnet/HerokuAppNew/downloaded_files");
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
    }

    /**
     * Init pages.
     */
    public void initPages(){
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlPage = new DynamicControlPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        iframePage = new IframePage(driver);
        alertPage = new AlertPage(driver);
        jsExecutorPage = new JsExecutorPage(driver);
        dragAndDropPage = new DragAndDropPage(driver);
        fileDownloadPage = new FileDownloadPage(driver);
    }

    /**
     * End test.
     */
    @AfterMethod(enabled = false)
    public void endTest(){
        driver.quit();
    }

}

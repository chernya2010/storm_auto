package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

public class FileDownloadPage extends BasePage implements IConstants {
    /**
     * Instantiates a new File downloade page.
     *
     * @param driver the driver
     */
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page file downloade page.
     *
     * @return the file downloade page
     */
    public FileDownloadPage openPage(){
        driver.get(FILE_DOWNLOAD_PAGE_URL);
        return this;
    }

    /**
     * Download file file downloade page.
     *
     * @return the file downloade page
     */
    public FileDownloadPage downloadFile(String fileName){
        WebElement el = driver.findElement(By.xpath("//a[normalize-space()='" + fileName + "']"));
        el.click();
        return this;
    }

    /**
     * Check file in folder 2 boolean.
     *
     * @return the boolean
     */
    public boolean checkFileInFolder(String downloadFileName){
        File folder = new File(System.setProperty("user.dir", "D:/Stormnet/HerokuAppNew/downloaded_files"));
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                if (fileName.matches(downloadFileName)) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        return found;
    }

    public void dowloadFile2(){

    }
}

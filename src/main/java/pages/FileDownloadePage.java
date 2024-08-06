package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

public class FileDownloadePage extends BasePage implements IConstants {

    /**
     * Instantiates a new File downloade page.
     *
     * @param driver the driver
     */
    public FileDownloadePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page file downloade page.
     *
     * @return the file downloade page
     */
    public FileDownloadePage openPage(){
        driver.get(FILE_DOWNLOAD_PAGE_URL);
        return this;
    }

    /**
     * Download file file downloade page.
     *
     * @return the file downloade page
     * @throws InterruptedException the interrupted exception
     */
    public FileDownloadePage downloadFile() throws InterruptedException {
        WebElement el = driver.findElement(By.xpath("//a[normalize-space()='Excel.xlsx']"));
        el.click();
        return this;
    }

    /**
     * Check file in folder 2 boolean.
     *
     * @return the boolean
     */
    public boolean checkFileInFolder(){
        File folder = new File("C:/Users/chern/Downloads");
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                if (fileName.matches("^.*Excel.*$")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        System.out.println(f);
        f.deleteOnExit();
        return found;
    }
}

package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class FileUploadPage extends BasePage implements IConstants {
    public static final String FILE_PATH = "src/test/resources/test_file.txt";

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement chooseFileButton;
    @FindBy(xpath = "//input[@id='file-submit']")
    WebElement uploadFileButton;
    @FindBy(xpath = "//div[@id='uploaded-files']")
    WebElement uploadedFileName;

    /**
     * Instantiates a new File upload page.
     *
     * @param driver the driver
     */
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page file upload page.
     *
     * @return the file upload page
     */
    public FileUploadPage openPage(){
        driver.get(FILE_UPLOADE_PAGE_URL);
        return this;
    }

    /**
     * Get file to upload file upload page.
     *
     * @return the file upload page
     */
    public FileUploadPage getFileToUpload(){
        File uploadFile = new File(FILE_PATH);
        WebElement fileInput = chooseFileButton;
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        return this;
    }

    /**
     * Upload file file upload page.
     *
     * @return the file upload page
     */
    public FileUploadPage uploadFile(){
        uploadFileButton.click();
        return this;
    }

    /**
     * Get uploaded file name string.
     *
     * @return the string
     */
    public String getUploadedFileName(){
        return uploadedFileName.getText();
    }
}

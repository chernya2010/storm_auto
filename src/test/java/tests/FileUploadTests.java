package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FileUploadTests extends BaseTest{
    private static final String UPLOADED_FILE_NAME = "test_file.txt";

    /**
     * Check uploaded file name is correct test.
     */
    @Test
    public void checkUploadedFileNameIsCorrectTest(){
        fileUploadPage
                .openPage()
                .getFileToUpload()
                .uploadFile();
        Assert.assertEquals(UPLOADED_FILE_NAME, fileUploadPage.getUploadedFileName());
        driver.close();
    }
}

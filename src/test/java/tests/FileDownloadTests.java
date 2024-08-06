package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTests extends BaseTest{

    /**
     * Check the file in folder.
     *
     * @throws InterruptedException the interrupted exception
     */
    @Test
    public void checkTheFileInFolder() throws InterruptedException {
        fileDownloadePage
                .openPage()
                .downloadFile()
                .checkFileInFolder();
        Assert.assertTrue(fileDownloadePage.checkFileInFolder());
    }
}

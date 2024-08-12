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
    public void checkFileInFolder(){
        fileDownloadPage
                .openPage()
                .downloadFile("random_data.txt");
        Assert.assertTrue(fileDownloadPage.checkFileInFolder("random_data"));
    }
}

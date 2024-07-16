package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    @Test
    public void fillZipCodeFieldTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("888888");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("John");
        driver.findElement(By.name("last_name")).sendKeys("Connor");
        driver.findElement(By.name("email")).sendKeys("John@mail.com");
        driver.findElement(By.name("password1")).sendKeys("John");
        driver.findElement(By.name("password2")).sendKeys("John");
        driver.findElement(By.xpath("//*[@value='Register']")).click();


//        driver.quit();
    }
}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Checkboxes {
    /*проверить, что первый чекбокс unchecked, отметить первый чекбокс,
    проверить что он checked. Проверить, что второй чекбокс checked,
    сделать unhecked, проверить, что он unchecked*/
    @Test
    public void checkboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        boolean ischeckBox1Unchecked = driver.findElement(By.cssSelector("input:nth-of-type(1)")).isSelected();
        Assert.assertEquals(ischeckBox1Unchecked, false);
        driver.findElement(By.cssSelector("input:nth-of-type(1)")).click();
        boolean ischeckBox1Checked = driver.findElement(By.cssSelector("input:nth-of-type(1)")).isSelected();
        Assert.assertEquals(ischeckBox1Checked, true);
        boolean ischeckBox2Checked = driver.findElement(By.cssSelector("input:nth-of-type(2)")).isSelected();
        Assert.assertEquals(ischeckBox2Checked, true);
        driver.findElement(By.cssSelector("input:nth-of-type(2)")).click();
        boolean ischeckBox2Unchecked = driver.findElement(By.cssSelector("input:nth-of-type(2)")).isSelected();
        Assert.assertEquals(ischeckBox2Unchecked, false);
        driver.close();
    }
}
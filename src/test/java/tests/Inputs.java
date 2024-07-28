package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Inputs {
    /*Проверить на возможность ввести различные цифровые
     и нецифровые значения, используя Keys.ARROW_UP и Keys.ARROW_DOWN*/
    @Test
    public void inputTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement inputField = driver.findElement(By.tagName("input"));
        inputField.sendKeys("20");
        String actualIntValue = inputField.getAttribute("value");
        Assert.assertEquals(actualIntValue, "20");
        inputField.clear();

        inputField.sendKeys("abcd");
        String actualStrValue = inputField.getAttribute("value");
        Assert.assertEquals(actualStrValue, "");
        inputField.clear();

        inputField.sendKeys(Keys.ARROW_UP);
        String actualValue1 = inputField.getAttribute("value");
        Assert.assertEquals(actualValue1, "1");

        inputField.sendKeys(Keys.ARROW_DOWN);
        String actualValue2 = inputField.getAttribute("value");
        Assert.assertEquals(actualValue2, "0");
    }
}
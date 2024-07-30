package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    /*Взять все элементы дроп-дауна и проверить их наличие.
    Выбрать первый, проверить, что он выбран, выбрать второй, проверить, что он выбран*/
    @Test
    public void allDropdownElementsExistsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> allOptions = select.getOptions();
        Assert.assertEquals(allOptions.size(), 3);
        driver.close();
    }
    @Test
    public void firstDropdownElementExistsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        WebElement element1 = select.getFirstSelectedOption();
        Assert.assertEquals(element1.getText(), "Please select an option");
        driver.close();
    }
    @Test
    public void secondDropdownElementExistsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(1);
        WebElement element2 = select.getFirstSelectedOption();
        Assert.assertEquals(element2.getText(), "Option 1");
        driver.close();
    }
    @Test
    public void thirdDropdownElementExistsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(2);
        WebElement element3 = select.getFirstSelectedOption();
        Assert.assertEquals(element3.getText(), "Option 2");
        driver.close();
    }
}
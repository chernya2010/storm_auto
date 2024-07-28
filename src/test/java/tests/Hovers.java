package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Hovers {
    /*Сделать цепочку из действий: наведение на профиль,
    проверка имени, клик по ссылке, проверка что нет 404 ошибки.
    Повторить для каждого из профилей. Использовать класс Actions*/
    @Test
    public void hoversTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions action = new Actions(driver);

        //user1
        WebElement user1 = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
        action.moveToElement(user1).perform();
        WebElement hoverText1 = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h5"));
        Assert.assertEquals(hoverText1.getText(), "name: user1");
        WebElement linkInHover1 = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/a"));
        action.moveToElement(user1).moveToElement(linkInHover1).click().perform();
        WebElement userPage1 = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertNotEquals(userPage1.getText(), "Not Found");

        //user2
        WebElement user2 = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/img"));
        action.moveToElement(user2).perform();
        WebElement hoverText2 = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/h5"));
        Assert.assertEquals(hoverText2.getText(), "name: user2");
        WebElement linkInHover2 = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/a"));
        action.moveToElement(user2).moveToElement(linkInHover2).click().perform();
        WebElement userPage2 = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertNotEquals(userPage2.getText(), "Not Found");

        //user3
        WebElement user3 = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/img"));
        action.moveToElement(user3).perform();
        WebElement hoverText3 = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/h5"));
        Assert.assertEquals(hoverText3.getText(), "name: user3");
        WebElement linkInHover3 = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/a"));
        action.moveToElement(user3).moveToElement(linkInHover3).click().perform();
        WebElement userPage3 = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertNotEquals(userPage3.getText(), "Not Found");
    }
}
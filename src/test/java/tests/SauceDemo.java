package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SauceDemo {
    /*Залогиниться
    Добавить товар в корзину
    Перейти в корзину
    Проверить (assertEquals) стоимость товара и его имя в корзине
    */
    @Test
    public void sauceLabTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[name='login-button']")).click();
        driver.findElement(By.cssSelector("[name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.cssSelector("[data-test='shopping-cart-link']")).click();
        WebElement productName = driver.findElement(By.cssSelector("[data-test='inventory-item-name']"));
        WebElement productPrice = driver.findElement(By.cssSelector("[data-test='inventory-item-price']"));
        Assert.assertEquals(productName.getText(), "Sauce Labs Backpack");
        Assert.assertEquals(productPrice.getText(), "$" + "29.99");
    }
}
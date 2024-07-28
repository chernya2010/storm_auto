package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Homework4 {
    /*
    Заполнить поле zipcode рандомным числом(сгенерировать) и зарегистрироваться
    */
    @Test
    public void registerWithRandomZipCodeTest() {
        int i = ThreadLocalRandom.current().nextInt(100000, 1000000);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys(String.valueOf(i));
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("John");
        driver.findElement(By.name("last_name")).sendKeys("Connor");
        driver.findElement(By.name("email")).sendKeys("123@mail.com");
        driver.findElement(By.name("password1")).sendKeys("John");
        driver.findElement(By.name("password2")).sendKeys("nhoJ");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        String err_message = driver.findElement(By.xpath("//*[@class='confirmation_message']")).getText();
        Assert.assertEquals(err_message, "Account is created!");
//        driver.close();
    }
}
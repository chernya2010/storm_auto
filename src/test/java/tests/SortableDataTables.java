package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SortableDataTables {
    /*Проверить содержимое нескольких (3-5) ячеек таблицы.
    Использовать xpath типа //table//tr[1]//td[1] - получение
    первой ячейки из первого ряда первой таблицы и так далее*/
    @Test
    public void checkTable1ValuesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement cell1 = driver.findElement(By.xpath("//*[@id=table1]/tbody/tr[1]/td[1]"));
        Assert.assertEquals(cell1.getText(), "Smith");
        WebElement cell2 = driver.findElement(By.xpath("//*[@id=table1]/tbody/tr[2]/td[1]"));
        Assert.assertEquals(cell2.getText(), "Bach");
        WebElement cell3 = driver.findElement(By.xpath("//*[@id=table1]/tbody/tr[3]/td[1]"));
        Assert.assertEquals(cell3.getText(), "Doe");
    }
}
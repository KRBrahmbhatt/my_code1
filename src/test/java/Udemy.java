import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Udemy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/join/login-popup/?next=/course/selenium-real-time-examplesinterview-questions/learn/");
//        driver.findElement(By.name("email")).sendKeys("kaushalbrahmbhattt@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("Kaushal@2345");
//        driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();

        driver.findElement(By.xpath("//input[@id='u99-search-form-autocomplete--3']")).sendKeys("post");
        //driver.findElement(By.id("search-form-autocomplete--7-menu-content-items")).sendKeys("pos");
        Thread.sleep(10000);
        List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"ud-search-form-autocomplete-suggestion-content\"]"));



        Thread.sleep(10000);


        for (WebElement option :options) {
            if (option.getText().equalsIgnoreCase("Postman: The Complete Guide - REST API Testing")) {
                Thread.sleep(5000);

                option.click();
                break;
            }
        }
    }
}

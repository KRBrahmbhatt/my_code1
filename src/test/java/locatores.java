import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class locatores {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("Kaushal");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123456");
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Kaushal");
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("kaushal@rtuy.com");
        driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("kaushal@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9534353952");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector("button[class=go-to-login-btn]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class=\"submit signInBtn\"]")).click();
        //driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
        driver.close();



    }
}

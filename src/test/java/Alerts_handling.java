import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_handling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String text="kaushal Brahmbhatt";
                driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

                  System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());



        driver.switchTo().alert().dismiss();

































    }

























}



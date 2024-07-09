import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class scope_ {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        List<WebElement> Links = driver.findElements(By.xpath("//div[@id='navFooter']//a"));
        System.out.println(Links.size());
        for (WebElement link : Links){
            String l = link.getText();
            System.out.println(l);
        }

                WebElement i = driver.findElement(By.id("navFooter"));
        System.out.println(i.findElements(By.tagName("a")).size());

        WebElement column1 = driver.findElement(By.cssSelector(".navFooterLinkCol.navAccessibility"));
        System.out.println(column1.findElements(By.tagName("a")).size());
        for (int o=1;o<(column1.findElements(By.tagName("a")).size());o++)
        {
            String clickonlinktab =Keys.chord(Keys.CONTROL,Keys.ENTER);
            column1.findElements(By.tagName("a")).get(o).sendKeys(clickonlinktab);
            Thread.sleep(5000);


        }

        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();

        while(it.hasNext())
        {

            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }




    }
}

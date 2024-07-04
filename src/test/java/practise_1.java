import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practise_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");
        add(driver);


    }
     public static void add(WebDriver driver)
     {
         String namee = "Odonil Bathroom Air Freshner Blocks Mixed Fragrances - 192g (48g*4) | Mixed Fragrances: Jasmine, Lavender, Orchid, Rose| Long Lasting Fragrance | Lasts upto 30 days";
         List<WebElement> items = driver.findElements(By.xpath("//div[@class=\"p13n-sc-truncate-desktop-type2  p13n-sc-truncated\"]"));
         for (int i = 0; i < items.size(); i++) {
             String updatedname = items.get(i).getAttribute("title");

             if (updatedname.contains(namee)) {
                 driver.findElement(By.xpath("//div[@title='"+namee+"']")).click();
             }

         }

     }
}

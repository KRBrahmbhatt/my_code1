import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Drop_downspractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(3);

        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
      for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
          driver.findElement(By.id("btnclosepaxoption")).click();

          driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
          driver.findElement(By.xpath("(//a[@value=\"MAA\"])[1]")).click();
          driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
          Thread.sleep(5000);
          driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));

        for (WebElement option :options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

            System.out.println("Total Checkbox count is: "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
            Thread.sleep(3000);
             System.out.println("Is Checkbox Selected: "+driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
            Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());


           driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();
           System.out.println("Checkbox selected?: "+driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());

            Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }
          //  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();






        }




    }

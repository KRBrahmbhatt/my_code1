import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class fileUpload {
    public static void main(String[] args) throws InterruptedException, IOException {
        String dynamicPath = System.getProperty("user.dir");
//        HashMap<String,Object> chromeprefs = new HashMap<String, Object>();
//        chromeprefs.put("profile.default_content_settings_popups",0);
//        chromeprefs.put("download.default_directory",dynamicPath);
//        ChromeOptions c = new ChromeOptions();
//        c.setExperimentalOption("prefs",chromeprefs);
        WebDriver driver = new ChromeDriver();
                driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
                Thread.sleep(3000);
                Runtime.getRuntime().exec("C:\\Users\\Kaushal\\Documents\\fileupload2");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));
                driver.findElement(By.id("processTask")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
                driver.findElement(By.cssSelector("#pickfiles")).click();
                Thread.sleep(5000);
                File outputFile = new File("C:\\Users\\Kaushal\\Downloads\\ilovepdf_pages-to-jpg (1).zip");

                if(outputFile.exists())
                {
                   Assert.assertTrue(outputFile.exists());
                    if(outputFile.delete())
                    {
                        System.out.println("file deleted");
                    }

                }




    }

}







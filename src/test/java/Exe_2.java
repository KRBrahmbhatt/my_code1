import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe_2 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento2demo.firebearstudio.com/");
        System.out.println(driver.findElement(By.xpath("//p[6]//span[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//p[7]//span[1]")).getText());
        String password =driver.findElement(By.xpath("//p[7]//span[1]")).getText();
        String[] pass2 =password.split(": ");
        String finalpass = pass2[1];

        System.out.println(finalpass);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class flipkart {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_7f0a6e20-7f49-4eda-9db6-43316947ab6f_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
       additemes(driver);
    }

    public static void additemes(WebDriver driver)
    {
        String naame ="";
        List<WebElement> List_1 = driver.findElements(By.xpath("//a[@class=\"wjcEIp\"]"));
        for (int i=0;i<List_1.size();i++)
        {
            String updatedlist=List_1.get(i).getText();
            if(updatedlist.contains(naame))
            {

            }
        }

    }
}

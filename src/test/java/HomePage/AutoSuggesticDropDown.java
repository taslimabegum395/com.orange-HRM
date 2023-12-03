package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

      public class AutoSuggesticDropDown {
       public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='_2qfc02']/button")).click();
        driver.findElement(By.xpath("input[@class='_370LK']")).sendKeys("iphone");
        //driver.findElements(By.xpath(""))
        driver.quit();




    }
}

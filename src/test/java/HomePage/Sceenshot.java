package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Sceenshot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);
       String tittlee =driver.getTitle();
        System.out.println("This tittle is capture before login from dashboard page : + tittlee");
    }
}

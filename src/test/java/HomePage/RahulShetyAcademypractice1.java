package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RahulShetyAcademypractice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//open url
driver.get("https://rahulshettyacademy.com/AutomationPractice/");


// get tittle

        String tittlee = driver.getTitle();
        System.out.println(tittlee);

        //page title test
       // driver.


    }
}

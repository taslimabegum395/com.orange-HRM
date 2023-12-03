package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class LoginWithTestNG {
    WebDriver driver;

    @Test(priority = 0)
    void openApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void logIn() {
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String actual = driver.getTitle();//practice page
        String expected = "Practice Page";
        Assert.assertEquals(actual, expected);

    }

    @Test(priority = 2)
    void browserClose() {

        driver.quit();
    }
    @Test(priority = 3)
    void mosammat(){
        System.out.println("Mosammat");
    }

}

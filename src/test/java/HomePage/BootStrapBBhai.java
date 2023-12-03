package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrapBBhai {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        //Thread.sleep(3000);

         driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
        //click on html

        driver.findElement(By.xpath("//input[@value='HTML']")).click();
       // click on css
          driver.findElement(By.xpath("//input[@value='CSS']")).click();
        driver.findElement(By.xpath("//input[@value='Angular']")).click();
          driver.findElement(By.xpath("//input[@value='Python']")).click();
         Thread.sleep(6000);
        List<WebElement> listofdropdown = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//label"));
        System.out.println(listofdropdown.size());

       // Selecting all the checkbox using enhance loop
        for (WebElement clickallcheckbox : listofdropdown) {
            clickallcheckbox.click();
            System.out.println(clickallcheckbox.getText());
        }
        Thread.sleep(3000);

    }
}










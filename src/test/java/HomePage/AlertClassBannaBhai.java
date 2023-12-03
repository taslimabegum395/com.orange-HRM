package HomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class AlertClassBannaBhai {
    /*
     * 1. User Launch Browser - Chromebrowser
     * 2. User Open Url - https://opensource-demo.orangehrmlive.com/
     * 3. User Provide username - Admin
     * 4. User Provide password - admin123
     * 5. User Click on login button
     * 6. User Verify the title of dashboard page. Exp title: Orange HRM
     * 7. User Close Browser
     * */
    public static void main(String[] args) throws InterruptedException {

        //1. User Launch Browser - Chromebrowser
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open Url - https://opensource-demo.orangehrmlive.com/
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
        Alert alertwindow = driver.switchTo().alert();
        System.out.println(alertwindow.getText());
        alertwindow.accept();
        Thread.sleep(3000);
        alertwindow.sendKeys("Welcome");
        Thread.sleep(3000);

        driver.quit();

    }
}
//This is from Shorov bhai
 //swith to alert example
//        driver.findElement(By.id("name")).sendKeys("hello");
//        Thread.sleep(5000);
//        driver.findElement(By.id("alertbtn")).click();
//       String alerttext = driver.switchTo().alert().getText();
//        System.out.println("Aleart message is :" +alerttext);
//        driver.switchTo().alert().accept();
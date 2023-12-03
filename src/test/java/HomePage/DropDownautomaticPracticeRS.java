package HomePage;

import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class DropDownautomaticPracticeRS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       driver.findElement(By.xpath("//input[@value='radio3']")).click();

        boolean rb = driver.findElement(By.xpath("//input[@value='radio3']")).isSelected();














        //drop down example
        WebElement mm = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select st = new Select(mm);
        st.selectByVisibleText("Option3");
        Thread.sleep(2000);
        //open Window example

        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        String childtitle = driver.getTitle();
        System.out.println(childtitle);
        // Assert.assertEquals(childtitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
        Thread.sleep(3000);
        driver.quit();
    }
}







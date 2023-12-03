package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBox2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
       driver.manage().deleteAllCookies();
       driver.get("https://itera-qa.azurewebsites.net/home/automation");
      String titlee =driver.getTitle();
        System.out.println(titlee);
//       driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='tuesday']")).click();
//        driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        driver.findElement(By.xpath("//input[@id='thursday']")).click();
//        driver.findElement(By.xpath("//input[@id='friday']")).click();
//        driver.findElement(By.xpath("//input[@id='saturday']")).click();
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();
//      Thread.sleep(6000);
       List<WebElement> allcheckboxitems =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Total number of days are: " + allcheckboxitems.size());
      //for(int i=0;i<allcheckboxitems.size();i++){
        Thread.sleep(4000);
       // for(int i=4;i<allcheckboxitems.size();i++){
         // allcheckboxitem.get(i).click();
        //enhanced for loop
        for(WebElement checkbox:allcheckboxitems){
            checkbox.click();
        }
         Thread.sleep(5000);
        driver.quit();
        }


    }


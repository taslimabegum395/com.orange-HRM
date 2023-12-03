package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class GoogleClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
//        Thread.sleep(6000);
//
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
//        List<WebElement>listofallitems=driver.findElements(By.xpath("//div[@class='ClJ9Yb']//span"));
//        System.out.println(listofallitems.size());
//       for(WebElement items:listofallitems) {
//            System.out.println(items.getText());
//            System.out.println("Total number of items:" +items );
        }
      // or loop
//        List<WebElement> listofitems = driver.findElements(By.xpath("//div[@id='Alh6id']//ul[@role='listbox']//li"));
//        System.out.println(listofitems.size());
//        for (int i = 0; i <listofitems.size(); i++) {
//            String items = listofitems.get(i).getText();
//            System.out.println(items);
        }
    }



////div[@class='wM6W7d']//span" banna bhai

















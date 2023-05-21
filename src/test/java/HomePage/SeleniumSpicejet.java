package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSpicejet {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//dynamic wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
        driver.get("https://www.spicejet.com/");
        Thread.sleep(6000);
        //   //user verify the tittle of dashboard page.exp tittle:spicejet
      // String tittlee =driver.getTitle();
      //  System.out.println(tittlee);
        //radio button
        //one way xpath //div[@class='css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-q4m81j']
   //driver.findElement(By.xpath("//div[contains(@class,'css-76zvg2 r-homxoj r-ubezar r-1ozqkpa')])[1]")).click();

driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-q4m81j']")).click();
//round trip xpath
// driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1x31b7q r-z2wwpe r-1loqt21 r-13awgt0 r-17sp8yy r-1777fci r-1otgn73']")).click();
//where to go
        driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-honxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys();
        //select passengers
       //(i make this one) driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1kihuf0 r-13awgt0 r-1tsuqlv r-a2ipxf r-1jwulwa r-13qz1uu']")).click();
     // driver.findElement(By.xpath(""))
    }
}

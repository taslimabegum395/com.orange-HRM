package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleLogin {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
     Thread.sleep(5000);

        List<WebElement> listofitems=driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
        System.out.println("Total number of selenium are  " + listofitems.size());

for(int i=0; i<listofitems.size(); i++){

    String items = listofitems.get(i).getText();
    System.out.println(items);

    if(items.equals("selenium supplement")){

        listofitems.get(i).click();
        break;
    }
}
String titlee =driver.getTitle();
System.out.println("This title is capture is capture before login from dashboard page"+titlee );


    }

}

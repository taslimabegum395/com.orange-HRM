package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumJquery {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        Thread.sleep(3000);
       String tittlee= driver.getTitle();
        System.out.println("This tittle is capture before login page from dashboard page:+ tittlee");
        driver.findElement(By.xpath("//button[@type='button']")).click();
      List<WebElement> list= driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
for(int i=0;i<list.size();i++){
   // System.out.println(list.get(i));// just i want to verify what i will find out from consular
    System.out.println(list.get(i).getText());
    if(list.get(i).getAttribute("class").equalsIgnoreCase("active")){
        System.out.println(list.get(i).getText());
    }
    else {
        list.get(i).click();
    }
}
Thread.sleep(3000);
driver.quit();

    }
}
//loop where its going to start and where its going to 
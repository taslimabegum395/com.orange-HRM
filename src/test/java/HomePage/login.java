package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    /*

   user launch Browser-Chromebrowser
   user open url-http://opensource-demo.orangehrmlive.com/
   user provide username-Admin
   user provide password-Admin123
   user click on  login button
   user verify the tittle of dashboard page.exp totle:Orange HRM
   user close Browser

     */
    public static void main(String[] args) throws InterruptedException {
        //user launch Browser-Chromebrowser
       // ChromeDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  user launch Browser-Firefoxbrowser
        //WebDriver driver1=new FirefoxDriver();
        //user open url-http://opensource-demo.orangehrmlive.com/
        driver.get("http://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
//        String  titlee = driver.getTitle();
//        System.out.println( "This title is capture before login from dashboard page: +titlee");
//
//
// user provide username-Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
//        //user provide password-Admin123
       driver.findElement(By.name("password")).sendKeys("admin123");
//       // user click on  login button
     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
       //user verify the tittle of dashboard page.exp tittle:Orange HRM
       String Title= driver.getTitle();
        System.out.println(Title);

//  user close Browser
        driver.quit();



    }
}


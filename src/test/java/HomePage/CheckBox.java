package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public  class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //implicity wait continiusly  check every sec.  all object  load or not holo kina
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        //if i wand single every check box  click
        // if we have 700 xpath how can i handle that time i should follow for loop
//        driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='Tuesday']")).click();
//        driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        driver.findElement(By.xpath("//input[@id='Thursday']")).click();
//        driver.findElement(By.xpath("//input[@id='frida']")).click();
//        driver.findElement(By.xpath("//input[@id='saturday']")).click();
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        List<WebElement> allcheckBoxiteams = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        //System.out.println("Total days are: "+  allcheckBoxiteams);
       // variable dile data type dite hobe
        //amra webpage teke je elements take tar data type holo WebElement /jodi sob iteams ekta jaigai cillect kori
// tar nam web Elements
        //List of WebElement
        //List start hobe capital diye
        System.out.println(allcheckBoxiteams.size());
       // System.out.println("Total number of days are: " + allcheckBoxiteams.size());//this call concatination
       //  total number dekhabe
        //select allthe checkbox
        //for loop
        // for(int i=0; i<allcheckBoxiteams.size(); i++) {
        // allcheckBoxiteams.get(i).click();
        // }
        //we can follow any one for loop method
        //enhanced for loop
        //for(WebElement checkbox:allcheckBoxiteams){
        //  checkbox.click();
        // }
      //  for (int i = 4; i < allcheckBoxiteams.size(); i++) {

      //      allcheckBoxiteams.get(i).click();
       // }
        Thread.sleep(2000);//2 sec wait korbe
        driver.quit();
    }
    }
        //allcheckBoxiteams ai iteam guli checkbox veriable er modde niye aslam and checkbox ta WebElement
        //ist data type nilam for loop starting,ending increment,decrement
        // Thread.sleep(2000);that means 2 sec.er ecution korar jonno stop kori dibe  wait korbe web browser er object download
        //untill finis 2 sec she kisu korbe
      //webpage er je elements gula take tar data type webElement
//list holo ekta class ei class ta ase external libraries er modde ase but ai page e import kore ante hobe.
        //System.out.println("Total number of days are : " +allcheckboxiteams.size());
//all items guli allcheckBoxiteams aitar moddde dokabe
        //allcheckBoxiteams data tyepe WebElement
        //amader scenario boltese drop down e jabo and box select korbo
// 3 kinds of wait 1 implicitlyWait 2.explicit wait 3.fluent wait
        // i can give index number from 4,5,6




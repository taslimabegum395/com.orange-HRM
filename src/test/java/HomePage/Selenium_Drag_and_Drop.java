package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

public class Selenium_Drag_and_Drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        WebElement frame = driver.findElement(By.tagName("iframe"));

        List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
        totalframe.size();
        System.out.println("Total frame size :" + totalframe.size());

        driver.switchTo().frame(frame);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action = new Actions(driver);


        Thread.sleep(3000);
        action.dragAndDrop(source, target).build().perform();

        // action.dragAndDrop(source,target).build().perform();//when i write this code its should be from drag on drop
        //action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
      //  driver.switchTo().defaultContent();//i can not understand why they this line
        Thread.sleep(3000);
        driver.quit();

    }}

//driver.switchTo().frame(0);
//WebElement SourceElement= driver.findElement(By.id("draggable"));
//WebElement TargetElement= driver.findElement(By.id("droppable"));
//Actions action = new Actions(driver);
//Thread.sleep(3000);
//action.dragAndDrop(SourceElement, TargetElement).build().perform();
//action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
//Thread.sleep(3000);
//driver.quit();






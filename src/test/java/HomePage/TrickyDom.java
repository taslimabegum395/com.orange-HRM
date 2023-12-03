package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class TrickyDom {
    public static <JavaScriptExecutor> void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //open url
        driver.get("https://selectorshub.com/xpath-practice-page/");
        List<WebElement> frame = driver.findElements(By.tagName("iframe"));
        System.out.println("total number of frame:...>  " + frame.size());
        WebElement scrollview = driver.findElement(By.xpath("//button[text()='Checkout here']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoview();", scrollview);

        //entering into iframe
        driver.switchTo().frame("pact");
    }}
        //entering first open Shadow root


        // String elementTeaValue;

      // String elementTeaValue;
//        WebElement elementTea = (WebElement) js
//                .executeScript("return document.querySelector('snacktime').shadowRoot.querySelector('#tea')",
//                       // elementTeaValue = "arguments[0].setAttribute ('value', 'Love Green Tea')";
//
//                       // String elementTeaValue="arguments[0].setAttribute('value' , 'Chicken Tikka Masala please')";
//
//
////      String  elementTeaValue = "arguments[0].setAttribute('value','Love Green Tea')";
////
////        js.executeScript(elementTeaValue, elementTea);
//      //  Thread.sleep(3000);
//
//
//        //entering 2nd open Shadow root
//
//
////        WebElement elementLunch = (WebElement) js
////                .executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\")"
////                        + ".shadowRoot.querySelector(\"#pizza\")");
////        String lunchItemValue = "arguments[0].setAttribute('value' , 'Chicken Tikka Masala please')";
////
////        js.executeScript(lunchItemValue, elementLunch);
////        Thread.sleep(3000);
////        driver.quit();

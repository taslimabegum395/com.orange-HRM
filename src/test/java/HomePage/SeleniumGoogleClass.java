package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumGoogleClass {
    // user launch Browser-Chromebrowser
    public static void main(String[] args) throws InterruptedException {
// user launch Browser-Chromebrowser
        // ChromeDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();

        String t = driver.getTitle();
        System.out.println(t);
        if (t.contentEquals("Mosammat")) {
            System.out.println("This is correct Google title");
        } else {
            System.out.println("This is not correct Google title");
        }
        String a = driver.getCurrentUrl();
        System.out.println(a);
        if (a.contentEquals("b")) {
            System.out.println("This is true");
        } else {
            System.out.println("This is fail");
        }
    }
        }
















package HomePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
        js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
        js.executeScript("document.getElementById('user_password').value='password';");
        js.executeScript("document.getElementById('user_submit').click();");
        js.executeScript("alert('enter correct login credentials to continue');");
        Thread. sleep(2000);
    }

    //creating a reference
    // JavascriptExecutor js=(JavascriptExecutor)driver;
    //calling the method
    // js.executeScript("{Java script code}");




    //How to get started with JavascriptExecutor
    //Import the package
    //Create a reference
    //Call the JavascriptExecutor methods
    //[java]
    ////importing the package
    //Import org.openqa.selenium.JavascriptExecutor;
    ////creating a reference
    //JavascriptExecutor js = (JavascriptExecutor) driver;
    ////calling the method
    //js.executeScript(script, args);
    //[/java]
}










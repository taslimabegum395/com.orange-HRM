package HomePage;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RahulshetyAcademy {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //open url
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);


        //page title test

        String actualTitle = driver.getTitle();//practice page
        String expectedTitle = "Practice Page";
        Assert.assertEquals(expectedTitle, actualTitle);


        //selecting radio button

        driver.findElement(By.xpath("//input[@value='radio3']")).click();

        boolean rb = driver.findElement(By.xpath("//input[@value='radio3']")).isSelected();
        System.out.println(rb);
        Assert.assertTrue(rb);


        //checkbox

        System.out.println("before checked:  " + driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());

        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println("after checked:  " + driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
        boolean b = driver.findElement(By.id("checkBoxOption2")).isSelected();
       Assert.assertTrue(b);

// alert

         driver.findElement(By.id("name")).sendKeys("hello");
                Thread.sleep(5000);
                driver.findElement(By.id("alertbtn")).click();
                String alerttext = driver.switchTo().alert().getText();
                System.out.println("Aleart message is :" + alerttext);
                driver.switchTo().alert().accept();



        //capture screenshot and store the image



        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // paste the screenshot in the desired location
        FileUtils.copyFile(file, new File("practice.png"));
        //First I took a file and then passed the reference variable=TakeScreenshot have been inserted into the driver
        //GetScreenshotAs is a method name
        //What type will the output file be?
        //What should be the name of the file that I entered
        //  takeScreenshot k driver modde dokano hoise we do type casting of driver
        //then i  give getScreenshotAs method then i put inside parameter
        // selenium e jar file create kora ase


        //Giving SendKeys to text field
        driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh");
        Thread.sleep(3000);
        driver.findElement(By.id("autocomplete")).clear();

        //drop down example

        WebElement ss = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(ss);
        select.selectByVisibleText("Option3");
        select.selectByVisibleText("Option2");


        //checkbox
        System.out.println("before checked:  " + driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());

        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println("after checked:  " + driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
        boolean bb = driver.findElement(By.id("checkBoxOption2")).isSelected();
        Assert.assertTrue(bb);

        //open tab example
         driver.findElement(By.xpath("//a[@id='opentab']")).click();


        //swith to alert example


        driver.findElement(By.id("name")).sendKeys("hello");
        Thread.sleep(5000);
        driver.findElement(By.id("alertbtn")).click();
        String alerttextt = driver.switchTo().alert().getText();
        System.out.println("Aleart message is :" + alerttextt);
        driver.switchTo().alert().accept();



        //mousehover
        driver.findElement(By.xpath("//button[@id='mousehover']")).click();


        //windowhandle

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        String parentId = itr.next();
        String childId = itr.next();
        Thread.sleep(3000);
        driver.switchTo().window(childId);
        System.out.println("The child title is " + driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }}



//WebElement parentElement = driver.findElement(By.cssSelector(".childElementClass"));
//        WebElement childElement =parentElement.findElement(By.cssSelector(".childElementClass"));
//        String childElementTitle= childElement.getAttribute("title");
//        System.out.println(childElementTitle);
//        String childtitle = driver.getTitle();
//        System.out.println(childtitle);
//     Assert.assertEquals(childtitle,"Rahul Shetty Academy");
//

//driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();


// child class object can be referred by parent interface reference variable
//WebDriver=interface,ChromeDiver is a class,driver is a ChromeDriver object,
//driver is reference variable of WebDriver means interface
// driver.navigate();//navigate do not give enough time for loading (navigate click before loading)
















import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Homer\\Desktop\\JAVA\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://timvroom.com/selenium/playground/");
        //1
        webDriver.findElement(By.id("answer1")).sendKeys(webDriver.getTitle());

        //2
        webDriver.findElement(By.id("name")).sendKeys("Kilgore Trout");
        Thread.sleep(1000);
        //3
        webDriver.findElement(By.id("occupation")).sendKeys("scifiauthor");
        Thread.sleep(1000);
        //4
        WebElement BB = (WebElement) webDriver.findElements(By.className("bluebox"));
        webDriver.findElement(By.id("answer4")).sendKeys(String.valueOf(BB));
        Thread.sleep(1000);
        //5
        WebElement five = webDriver.findElement(By.xpath("html/body/a[3]"));
        five.click();
        Thread.sleep(1000);
        //6
        webDriver.findElement(By.id("redbox")).getAttribute("class");
        webDriver.findElement(By.id("answer6")).sendKeys("class");
        Thread.sleep(1000);
        //7
        ((JavascriptExecutor)webDriver).executeScript("ran_this_js_function");
        Thread.sleep(1000);
        //8
        webDriver.findElement(By.id("answer8")).sendKeys((String)((JavascriptExecutor)webDriver).executeScript("got_return_from_js_function"));
        Thread.sleep(1000);
        //9
        webDriver.findElement(By.xpath(".//*[@id='testform']/input[2]")).click();
        Thread.sleep(1000);
        //10
        webDriver.findElement(By.id("answer10")).sendKeys(webDriver.findElement(By.id("redbox")).getText());
        Thread.sleep(1000);
        //11
        String eleven = webDriver.findElement(By.xpath("html/body/span")).getText();
        String answer = "";
         if (eleven.equals("orangebox"))
         {
             answer = "orange";
         }
         else
             answer = "greenbox";
        webDriver.findElement(By.id("answer11")).sendKeys(answer);
        Thread.sleep(1000);
        //12
        Dimension d = new Dimension(850,650);
        webDriver.manage().window().setSize(d);
        Thread.sleep(1000);
        //13
        Boolean visible1 = webDriver.findElements(By.id("ishere")).size() > 0;
        if (visible1 == true)
        {
            webDriver.findElement(By.id("answer13")).sendKeys("yes");
        }
        else
            webDriver.findElement(By.id("answer13")).sendKeys("no");
        Thread.sleep(1000);
        //14
        Boolean visible2 = webDriver.findElements(By.id("purplebox")).size() > 0;
        if (visible2 == true)
        {
            webDriver.findElement(By.id("answer14")).sendKeys("yes");
        }
        else
            webDriver.findElement(By.id("answer14")).sendKeys("no");
        Thread.sleep(1000);
        //15

        //16

        //17
        Thread.sleep(1000);
        webDriver.findElement(By.id("submitbutton")).click();
        webDriver.findElement(By.id("checkresults")).click();
    }
}

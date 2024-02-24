import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Implicit wait - waits for all elements at least 10 sends if not found quickly
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");

        try{
            WebElement userInput = driver.findElement(By.name("username"));
            System.out.println("Username input box found: " + userInput.getAttribute("placeholder"));
        } catch (Exception e){
            System.err.println("Username element not found");
            System.out.println("Seems like slow page loading...");
        }


//        Explicit wait - waits for desired elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        System.out.println("Found: " + driver.findElement(By.name("password")).getAttribute("placeholder"));


        driver.quit();
    }
}
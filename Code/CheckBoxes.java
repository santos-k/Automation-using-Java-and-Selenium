import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Print all dropdown values
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[starts-with(@id,'checkBoxOption')]"));
        for (WebElement value : checkBoxes){
            System.out.println("CheckBox Value: " + value.getAttribute("value"));
            sleep(2000);
            value.click();
        }

        sleep(3000);
        driver.quit();
    }

    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


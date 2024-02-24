import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      Frames: four frames are there in this page
        driver.get("https://the-internet.herokuapp.com/nested_frames");

//      Page -> Top Frame -> Left/Middle/Right frames
        driver.switchTo().frame("frame-top");

//      Left Frame
        driver.switchTo().frame("frame-left");
        System.out.println("Frame URL: " + driver.getCurrentUrl());
        System.out.println("Frame Text: " + driver.findElement(By.tagName("body")).getText());

        // Switch back to the top frame
        driver.switchTo().parentFrame();

//      Middle Frame
        driver.switchTo().frame("frame-middle");
        System.out.println("Frame URL: " + driver.getCurrentUrl());
        System.out.println("Frame Text: " + driver.findElement(By.tagName("body")).getText());

        // Switch back to the top frame
        driver.switchTo().parentFrame();

//      Right Frame
        driver.switchTo().frame("frame-right");
        System.out.println("Frame URL: " + driver.getCurrentUrl());
        System.out.println("Frame Text: " + driver.findElement(By.tagName("body")).getText());

        // Switch back to the top frame
        driver.switchTo().defaultContent();


//      Right Frame
        driver.switchTo().frame("frame-bottom");
        System.out.println("Frame URL: " + driver.getCurrentUrl());
        System.out.println("Frame Text: " + driver.findElement(By.tagName("body")).getText());

        // Switch back to the top frame
        driver.switchTo().defaultContent();

        driver.quit();

    }
}

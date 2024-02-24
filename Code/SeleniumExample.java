import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;

public class SeleniumExample {
    public static void main(String[] args) {

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximise the browser window
        driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://testautomationpractice.blogspot.com/");
        String title = driver.getTitle();

        System.out.println("Window Title: " + title);



        // Close the browser
//        driver.quit();
    }
}

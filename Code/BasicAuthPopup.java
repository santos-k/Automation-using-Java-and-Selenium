import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BasicAuthPopup {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        String url = "the-internet.herokuapp.com/basic_auth";

        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Open the URL with basic authentication credentials
        driver.get("https://" + username + ":" + password + "@" + url);
        System.out.println("Title: " + driver.getTitle());
        // Perform actions on the authenticated page

        sleep(3000);
        // Close the browser
        driver.quit();

    }
    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowsersExample {
    public static void main(String[] args) {
        // Chrome
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        openUrl(chromeDriver, "https://testautomationpractice.blogspot.com/");


        // Firefox
//        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();
        openUrl(firefoxDriver, "https://testautomationpractice.blogspot.com/");


        // Edge
//        System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
        WebDriver edgeDriver = new EdgeDriver();
        openUrl(edgeDriver, "https://testautomationpractice.blogspot.com/");

        // Sleep for 5 seconds
        sleep(5000);

        // Close browsers
        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
    }

    private static void openUrl(WebDriver driver, String url) {
        driver.manage().window().maximize();
        driver.get(url);
        String browserName = driver.getClass().getSimpleName();
        String title = driver.getTitle();
        System.out.println(browserName + " - Opened URL: " + url);
        System.out.println("Window Title: " + title);
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

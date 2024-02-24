import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsiteinBrowser {
    public static void main(String[] args) {

//        Instance for chrome driver
        WebDriver driver = new ChromeDriver();

//        Maximize the browser window
        driver.manage().window().maximize();

//        Open url in browser
        driver.get("https://testautomationpractice.blogspot.com/");

//      print title and current url in console
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        sleep(3000);

//        close the driver
        driver.quit();


    }

//  Method for thread Sleep
    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

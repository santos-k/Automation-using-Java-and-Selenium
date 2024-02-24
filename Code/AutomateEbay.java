import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class AutomateEbay {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-btn")).click();

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        System.out.println("Title: " + title);
        System.out.println("URL: " + url);

        sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"item26c29dcd5d\"]/div/div[2]/a")).click();

        System.out.println("Title" + driver.getTitle());
        System.out.println("Windows: " + driver.getWindowHandles());


        sleep(5000);
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



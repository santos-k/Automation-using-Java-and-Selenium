import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTextClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement phone = driver.findElement(By.id("phone"));
        WebElement wiki = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        WebElement wiki_btn = driver.findElement(By.className("wikipedia-search-button"));

//        Enter full name in name input box after 1 sec pause
        sleep(1000);
        name.sendKeys("Robin Hub");

//        Enter email in email input box after 1 sec pause
        sleep(1000);
        email.sendKeys("robinhud@gmail.com");

//        Enter phone number in input box after 1 sec pause
        sleep(1000);
        phone.sendKeys("9876543210");

//        Enter Search word in wikipedia search box after 2 secs pause
        sleep(2000);
        wiki.sendKeys("Java");

//        Click in search button after 2 secs
        sleep(2000);
        wiki_btn.click();

//        Close the browser after 5 seconds
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

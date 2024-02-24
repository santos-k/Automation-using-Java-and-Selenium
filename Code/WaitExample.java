//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class WaitExample {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//
//        // Implicit Wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // Navigate to a website
//        driver.get("https://www.youtube.com");
//
//        // Explicit Wait
//        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
//        WebElement element = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementId")));
//        element.click();
//
//        // Fluent Wait
//        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//        WebElement fluentElement = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("anotherElementId")));
//        fluentElement.sendKeys("Hello, Fluent Wait!");
//
//        // Close the browser
//        driver.quit();
//    }
//}

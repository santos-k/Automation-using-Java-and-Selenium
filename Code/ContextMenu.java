import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ContextMenu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/context_menu");

//        Printing Text on context page
        WebElement example = driver.findElement(By.className("example"));
        System.out.println(example.getText());

//        Context menu: Context menu items are custom additions that appear in the right-click menu.
        WebElement ContextMenu = driver.findElement(By.id("hot-spot"));
        System.out.println("oncontextmenu: " + ContextMenu.getAttribute("oncontextmenu"));
        Actions action = new Actions(driver);
        action.doubleClick(ContextMenu).perform();

        sleep(3000);
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

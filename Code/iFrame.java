import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement heading = driver.findElement(By.xpath("/html/body/div[5]/fieldset/legend"));
        System.out.println("iFrame Heading: " + heading.getText());

//        Iframe id = courses-iframe
        driver.switchTo().frame("courses-iframe");

        WebElement email = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[1]/ul/li"));
        System.out.println("Iframe: " + driver.getTitle());
        System.out.println("Email inside iFrame: " + email.getText());


        driver.quit();
    }
}

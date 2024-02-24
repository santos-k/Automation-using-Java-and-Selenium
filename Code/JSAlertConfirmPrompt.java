import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSAlertConfirmPrompt {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

//        JS Alert
        WebElement alert_btn = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
        alert_btn.click();

        sleep(2000);

        Alert alert_win =  driver.switchTo().alert();
        System.out.println("Alert Text: " + alert_win.getText());
        sleep(2000);
        alert_win.accept();

        // JS Confirmation
        WebElement confirm_btn = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
        confirm_btn.click();

        sleep(2000);

        Alert confirm_win =  driver.switchTo().alert();
        System.out.println("Confirmation Text: " + confirm_win.getText());
        sleep(2000);
        confirm_win.accept();

        // JS Prompt
        WebElement prompt_btn = driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
        prompt_btn.click();

        sleep(2000);

        Alert prompt_win =  driver.switchTo().alert();
        prompt_win.sendKeys("Hello Java");
        System.out.println("Prompt Text: " + prompt_win.getText());
        sleep(2000);
        prompt_win.accept();

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

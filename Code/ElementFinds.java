import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFinds {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

//        Finding element by ID
        WebElement elementById = driver.findElement(By.id("name"));
        System.out.println("Element ID : " + elementById.getAttribute("id") + " Element Tag: " + elementById.getTagName());

//        Finding element by Name
        WebElement elementByName = driver.findElement(By.name("Header"));
        System.out.println("Element Name : " + elementByName.getAttribute("name") + " Element Tag: " + elementByName.getTagName());

//        Finding element by Class
        WebElement elementByClassName = driver.findElement(By.className("Wikipedia"));
        System.out.println("Element Class Name : " + elementByClassName.getAttribute("class") + " Element Tag: " + elementByClassName.getTagName());

//        Finding element by Tag name
        WebElement elementByTagname = driver.findElement(By.tagName("body"));
        System.out.println("Element Tag Name : " + elementByTagname.getAttribute("value") + " Element Tag: " + elementByTagname.getTagName());

//        Finding element by CSS Selector
        WebElement elementByCSSSelector = driver.findElement(By.cssSelector("#male"));
        System.out.println("Element Class  : " + elementByCSSSelector.getAttribute("class") + " Element Tag: " + elementByCSSSelector.getTagName());

//        Finding element by Link Text
        WebElement elementByLinkText = driver.findElement(By.linkText("Blogger"));
        System.out.println("Element LINK TEXT : " + elementByLinkText.getText() + " Element Tag: " + elementByLinkText.getTagName());

//        Finding element by Partial Link Text
        WebElement elementByPartialLink = driver.findElement(By.partialLinkText("marius"));
        System.out.println("Element Partial Link Text : " + elementByPartialLink.getAttribute("href") + " Element Tag: " + elementByPartialLink.getTagName());

//        Finding element by XPATH
        WebElement elementByXpath = driver.findElement(By.xpath("//*[@id=\"HTML8\"]/h2"));
        System.out.println("Element XPATH : " + elementByXpath.getText() + " Element Tag: " + elementByXpath.getTagName());


//      Close the driver
        driver.quit();
    }
}

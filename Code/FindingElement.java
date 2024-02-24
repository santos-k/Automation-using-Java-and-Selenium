import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class FindingElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        Basic Get methods
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Window ID: " + driver.getWindowHandles());

//        Finding element and getting logo image url and url from link text
        String logo_img = driver.findElement(By.className("logoClass")).getAttribute("src"); // Logo
        String Text_URL = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).getAttribute("href");

        System.out.println("Logo Img URL: " + logo_img);
        System.out.println("Text URL: " + Text_URL);

//        Menu buttons
        WebElement home_btn = driver.findElement(By.xpath("/html/body/header/div/a/button"));
        System.out.println("Button in Menu: " + home_btn.getText());

        List<WebElement> buttons = (List<WebElement>) driver.findElements(By.xpath("/html/body/header/div/button"));
        for ( WebElement button : buttons ){
            System.out.println("Button in Menu: " + button.getText());
        }

//        Heading on page
        WebElement heading = driver.findElement(By.xpath("/html/body/h1"));
        System.out.println("Heading of Page: " + heading.getText());

//      Radio button heading
        WebElement subhead1 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend"));
        System.out.println("Sub-Heading1 of Page: " + subhead1.getText());

//        Radio buttons values
        List<WebElement> radio_btns = driver.findElements(By.name("radioButton"));
        for (WebElement radio : radio_btns){
            System.out.println("Radio buttons value: " + radio.getAttribute("value"));
            sleep(2000);
            radio.click();
        }

//        Heading of Dynamic Dropdown
        WebElement dynamicDropDownHead = driver.findElement(By.xpath("//div[@id='select-class-example']//legend"));
        System.out.println("Dynamic Dropdown Title: " +dynamicDropDownHead.getText());

//        Dynamic Heading
        WebElement dynamicDropdown = driver.findElement(By.id("autocomplete"));
        dynamicDropdown.sendKeys("India");
        sleep(1000);
        System.out.println("Dynamic Dropdown Placeholder: " + dynamicDropdown.getAttribute("placeholder") + ", Type: " + dynamicDropdown.getAttribute("type"));

        List<WebElement> DynamicDropdownValues = driver.findElements(By.xpath("//*[@class='ui-menu-item']//div"));
        for (WebElement value : DynamicDropdownValues){
            System.out.println("Dyn_Dropdown Value: " + value.getText());
            if (value.getText() == "India"){
                value.click();
            }

        }

        System.out.println("Dropdown heading: " + driver.findElement(By.xpath("//div[@class='cen-right-align']//legend")).getText());

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));  // Replace with the actual ID of the dropdown

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Print all dropdown values
        List<WebElement> allOptions = dropdown.getOptions();
        for (WebElement option : allOptions) {
            System.out.println("Dropdown Values: " + option.getText());
        }

        // Select a specific option by visible text
        String optionToSelect = "Option2";  // Replace with the text of the option you want to select
        dropdown.selectByVisibleText(optionToSelect);

        System.out.println("CheckBox heading: " + driver.findElement(By.xpath("//div[@class='right-align']//legend")).getText());

//        Print All checkboxes
        // Print all dropdown values
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[starts-with(@id,'checkBoxOption')]"));
        for (WebElement value : checkBoxes){
            System.out.println("CheckBox Value: " + value.getAttribute("value"));
            sleep(2000);
            value.click();
        }

//        Click btn to open new window
        driver.findElement(By.id("openwindow")).click();
        System.out.println("Windows id after New window opened: " + driver.getWindowHandles());

        sleep(2000);

//        Click btn to open new tab
        driver.findElement(By.id("opentab")).click();
        System.out.println("Windows id after new tab opened: " + driver.getWindowHandles());

//      Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the first window
        String firstWindowHandle = windowHandles.iterator().next();
        driver.switchTo().window(firstWindowHandle);


//        Input box
        driver.findElement(By.id("name")).sendKeys("Java");

        sleep(2000);
        // Example for Alert
        WebElement alertButton = driver.findElement(By.id("alertbtn")); // Replace with the actual ID of the button
        alertButton.click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert and print it
        System.out.println("Alert Text: " + alert.getText());

        sleep(2000);
        // Accept the alert (click on OK)
        alert.accept();
        System.out.println("Alert got response!");


        driver.findElement(By.id("name")).sendKeys("Selenium");
        // Example for Confirm
        WebElement confirmButton = driver.findElement(By.id("confirmbtn")); // Replace with the actual ID of the button
        confirmButton.click();

        // Switch to the confirm
        Alert confirmAlert = driver.switchTo().alert();

        sleep(2000);
        // Get the text of the confirm and print it
        System.out.println("Confirm Text: " + confirmAlert.getText());

        sleep(2000);
        // Dismiss the confirm (click on Cancel)
        confirmAlert.accept();
//        confirmAlert.dismiss();
        System.out.println("Confirmation received!");


        sleep(2000);
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

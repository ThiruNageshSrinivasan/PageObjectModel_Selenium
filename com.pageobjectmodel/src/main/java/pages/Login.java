package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        // form filling
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("thirunagesh srinivasan");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("thirusrinivasan558@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("13121997@Prac");

        // checkbox
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement java = driver.findElement(By.id("check0"));
        if (java.isSelected()) {
            java.click();
            System.out.println("Checkbox 'Java' was selected, now unselected.");
        } else {
            java.click();
            System.out.println("Checkbox 'Java' was unselected, now selected.");
        }
        Thread.sleep(3000);

        WebElement selenium = driver.findElement(By.id("check1"));
        if (selenium.isSelected()) {
            selenium.click();
            System.out.println("Checkbox 'Selenium' was selected, now unselected.");
        } else {
            selenium.click();
            System.out.println("Checkbox 'Selenium' was unselected, now selected.");
        }
        Thread.sleep(3000);

        WebElement cucumber = driver.findElement(By.id("check2"));
        if (cucumber.isSelected()) {
            cucumber.click();
            System.out.println("Checkbox 'Cucumber' was selected, now unselected.");
        } else {
            cucumber.click();
            System.out.println("Checkbox 'Cucumber' was unselected, now selected.");
        }
        Thread.sleep(3000);

        WebElement java1 = driver.findElement(By.id("rad0"));
        java1.click();
        System.out.println("Selected radio: " + java1.getAttribute("value"));

        Thread.sleep(3000);

        WebElement selenium2 = driver.findElement(By.id("rad1"));
        selenium2.click();
        System.out.println("Selected radio: " + selenium2.getAttribute("value"));

        Thread.sleep(3000);

        WebElement cucumber3 = driver.findElement(By.id("rad2"));
        cucumber3.click();
        System.out.println("Selected radio: " + cucumber3.getAttribute("value"));

        // dropdown
        WebElement seltext = driver.findElement(By.id("seltext"));
        Select sc = new Select(seltext);

        // Print all options in the dropdown
        List<WebElement> options = sc.getOptions();
        for (WebElement option : options) {
            System.out.println("Dropdown option: " + option.getText());
        }

        // Optionally select each one by index (e.g., 0 to 4)
        for (int i = 0; i < options.size(); i++) {
            sc.selectByIndex(i);
            Thread.sleep(2000);
            System.out.println("Selected: " + sc.getFirstSelectedOption().getText());
        }
    }
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorDemo1 {
    static String baseUrl = "https://demowebshop.tricentis.com/";

    public static void main(String[] args) {
        // 1. step browser
        WebDriver driver = new ChromeDriver();
        //open the URL in browser
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 2. find the element using Id and name locator

      //  WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        WebElement searchBox = driver.findElement(By.id("q"));

        //3. Action on element
        searchBox.sendKeys("mobile");
        
    }

}

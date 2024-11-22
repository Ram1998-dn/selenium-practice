package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocatorDemo2 extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LocatorDemo2.class);
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void locatorDemo2(){
       // Link Test Locator
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find Email Filed Element id Locator
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nisha98@gmail.com");

        //Find Password field element using name locator
        WebElement passwordField= driver.findElement(By.name("Password"));
        passwordField.sendKeys("123@r");

    }
    @After
    public void tearDown(){

    }
}

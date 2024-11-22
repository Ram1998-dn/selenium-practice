package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocatorDemo3 extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LocatorDemo3.class);
    String baseUrl = "https://www.letskodeit.com/login";

    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void locatorDemo3(){
    // Link text Locator
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        forgotPasswordLink.click();

        //Partial link text Locator
        driver.findElement(By.partialLinkText("in"));
    }
    @After
    public void tearDown(){

    }
}

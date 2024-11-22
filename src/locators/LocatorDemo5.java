package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo5() throws InterruptedException {
        //Relative xpath
        // tagName(@attribute = 'value')
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id = 'small-searchterms']")).sendKeys("Mobile");

        //xpath path or
        // tagName(@attribute = 'value' or @attribute="value")
        driver.findElement(By.xpath("//input[@id = 'small-searchterms' or @name='q']")).sendKeys("Mobile");

        // xpath with end
        // tagName(@attribute = 'value' and @attribute="value")
        driver.findElement(By.xpath("//input[@id = 'small-searchterms' and @name='q']")).sendKeys("Mobile");

        //xpath with starts-with9()
        //tagName[starts-with(@attribute , 'value')]

        ////input[starts-with(@id, 'small')] - chat
        driver.findElement(By.xpath("//input[starts-with(@id, 'small')]")).sendKeys("Mobile");

        //xpath with contains()
        //tagName[contains(@attribute, 'value')]
        driver.findElement(By.xpath("//input[contains(@id, 'small')]")).sendKeys("Mobile");

        // xpath with text()
        // tagName[text() = 'value']
        driver.findElement(By.xpath("//a[ text() = 'log in']")).click();

        // xpath with chained
        //div[@class='header-menu'] //a[text() = 'Books']




    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}

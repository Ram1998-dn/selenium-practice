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

public class LocatorDemo4 extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LocatorDemo4.class);
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo4() {
        // Class Name Locator----> to find multiple elements
        List<WebElement> sliderElements = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total Slides are : " + sliderElements.size());

        // Tage Name Locator -----> to find multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : " + links.size());

        // list of link elements using for each loop
        for(WebElement link :links){
            System.out.println(link.getText());
        }


    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}

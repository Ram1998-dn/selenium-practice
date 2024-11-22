package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //For firefox Browser


        //open the URL in browser
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        // we giv implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Get Current URl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URl " +currentUrl);

        //Get page source
        System.out.println("The page source code " + driver.getPageSource());

        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        // Navigate Back
        driver.navigate().back();
        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        // Refresh the page
        driver.navigate().refresh();

        // Forward the page
        driver.navigate().forward();
        System.out.println("Get Current URL : " + driver.getCurrentUrl());







        //Close the browser
        driver.close();
    }
}

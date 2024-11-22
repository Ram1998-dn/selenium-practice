package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class ChromeOptionsExample {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("---disable-notification---");
        options.addArguments("--incognito--");
        options.addArguments("--headless---");



        String baseUrl = "https://www.justdial.com/";
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver(options);

        //open the URL in browser
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        // we giv implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}

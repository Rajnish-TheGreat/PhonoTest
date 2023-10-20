package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PHBrowserConfig {

    public static ThreadLocal<WebDriver> driverThread = ThreadLocal.withInitial(() -> {
        WebDriver driver = null;
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu"); // Applicable to Windows OS only
            options.addArguments("headless");
            options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security mode

            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize(); // Maximize the browser window
        } catch (Exception e) {
            // Handle exceptions, log them, or throw a custom exception
            e.printStackTrace();
        }
        return driver;
    });
}


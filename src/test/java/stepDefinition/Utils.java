package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Utils {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void shutDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    public static void navigate(String url) {
        driver.get(url);
    }

    public static WebElement getElement(By selector) {
        return driver.findElement(selector);
    }

    public static Object executeScript(String script, WebElement el) {
        return ((JavascriptExecutor) driver).executeScript(script, el);
    }

    public static void scrollPage(WebElement element) {
        executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickElement(By selector) {
        getElement(selector).click();
    }

    public static void moveToProductPage(WebElement image) {
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

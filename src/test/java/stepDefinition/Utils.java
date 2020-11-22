package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


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

    public static void scroll(WebElement element) {
        executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void moveToProductPage(WebElement image) {
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
    }

    public static void moveSlider(WebElement slider1, WebElement slider2) {
        Actions move = new Actions(driver);
        Action action1 = move.dragAndDropBy(slider1, 5, 0).build();
        Action action2 = move.dragAndDropBy(slider2, -200, 0).build();//88-311 dollars
        action1.perform();
        action2.perform();

    }
}

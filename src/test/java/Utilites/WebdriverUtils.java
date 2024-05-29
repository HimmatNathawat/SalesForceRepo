package Utilites;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebdriverUtils {

    public static WebDriver driver;
    static WebDriverWait wait;
    public static void initialize(String browser) {

        switch (PropertiesUtils.getProperty("browser")) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
//                ChromeOptions opt = new ChromeOptions();
//                opt.addArguments("--disable-notifications");
                driver = new ChromeDriver();
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void quit() throws InterruptedException {
        driver.quit();
    }

    public static void navigate(String url){
        driver.get(url);

    }
    public static void type(By locator, String value){
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);

    }
    public static void click(By locator) throws InterruptedException {
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

        Thread.sleep(3000);
            driver.findElement(locator).click();

    }

    public static String  All_apps(By locator) {

        List<WebElement> apps = driver.findElements(locator);

        return "Allapps";
    }

    public static void ValidateError(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator);
    }

    public static String getText(By locator) throws InterruptedException {

        //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }


    public static void clickonjs(By element) throws InterruptedException {
     wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(element));
    }
    public static void WithoutClickjs(By element) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(element));
    }
    public static void ScrollintoView(By element){
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(element));
    }
    public static void screenshot(WebDriver driver, String ScreenshotName) throws IOException {
        TakesScreenshot tc=(TakesScreenshot)driver;
        File src= tc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("src/test/Screenshots/"+ScreenshotName+".PNG"));
    }


}

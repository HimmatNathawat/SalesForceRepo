package com.metlife.Utilites;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class webdriverUtiles {

    public static WebDriver driver;
    static WebDriverWait wait;
    public static void initialize(String browser) {

        switch (PropertiesUtiles.getProperty("browser")) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("--disable-notifications");
                driver = new ChromeDriver(opt);
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
    public static void switchToFrameUsingName(String x)
    {
        driver.switchTo().frame(x);
    }

    public static void click(By locator)
    {
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();
    }
    public static void type(By locator, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }
    public static String getText(By locator) throws InterruptedException {

        //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }
    public static void screenshot(WebDriver driver, String ScreenshotName) throws IOException {
        TakesScreenshot tc=(TakesScreenshot)driver;
        File src= tc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("src/test/Screenshots/"+ScreenshotName+".PNG"));
    }
    public static void selectValuefromDropdown(By elementBy, String label) {

     Select abc =    new Select(driver.findElement(elementBy));
             abc.selectByVisibleText(label);
    }
    public static void clickonjs(By element) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(element));

}}

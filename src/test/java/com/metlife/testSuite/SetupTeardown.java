package com.metlife.testSuite;

import Utilites.WebdriverUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;

public class SetupTeardown {
    static ExtentReports extent;
    static ExtentTest test;
    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser){
        WebdriverUtils.initialize(browser);
    }
    @AfterClass
    public void Teardown() throws InterruptedException {
        WebdriverUtils.quit();
    }

    @BeforeTest
    public static void setConfiguration()
    {
        extent = new ExtentReports("src/test/Report/DemoReport.html", true);
        extent.addSystemInfo("Environment","Markating CRM Classic Testing");
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
    }
    @AfterMethod
    public static void getReport(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            test.log(LogStatus.FAIL,result.getThrowable()+"Test Failed");
        }
        else if(result.getStatus()==ITestResult.SKIP)
        {
            test.log(LogStatus.SKIP,result.getThrowable()+"Test Skipped");
        }
        else if(result.getStatus()==ITestResult.SUCCESS)
        {
            test.log(LogStatus.PASS,result.getThrowable()+"Test Passed");
        }
        extent.endTest(test);
    }
    @AfterTest
    public static void cleanUp()
    {
        extent.flush();
    }
}

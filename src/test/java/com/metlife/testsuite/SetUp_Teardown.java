package com.metlife.testsuite;

import com.metlife.Utilites.webdriverUtiles;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;

public class SetUp_Teardown {

    static ExtentReports extent;
    static ExtentTest test;
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browser){
        webdriverUtiles.initialize(browser);
    }
//    @AfterMethod
//    public void Teardown() throws InterruptedException {
//        Thread.sleep(5000);
//       // webdriverUtiles.quit();
//    }

//    @BeforeTest
//    public static void setConfiguration()
//    {
//        extent = new ExtentReports("src/test/Report/DemoReport.html", true);
//        extent.addSystemInfo("Environment","goibibo");
//        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
//    }
//    @AfterMethod
//    public static void getReport(ITestResult result)
//    {
//        if(result.getStatus()==ITestResult.FAILURE)
//        {
//            test.log(LogStatus.FAIL,result.getThrowable()+"Test Failed");
//        }
//        else if(result.getStatus()==ITestResult.SKIP)
//        {
//            test.log(LogStatus.SKIP,result.getThrowable()+"Test Skipped");
//        }
//        else if(result.getStatus()==ITestResult.SUCCESS)
//        {
//            test.log(LogStatus.PASS,result.getThrowable()+"Test Passed");
//        }
//        extent.endTest(test);
//    }
//    @AfterTest
//    public static void cleanUp()
//    {
//        extent.flush();
//    }
}



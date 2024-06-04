package com.metlife.testsuite;

import com.metlife.Utilites.webdriverUtiles;
import com.metlife.pageobject.HomePage;
import com.metlife.pageobject.SelectCity;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BookMyTrip_Ticket_Booking extends SetUp_Teardown {
WebDriver driver;
    @Test
    public void Login() throws InterruptedException {
        webdriverUtiles.navigate("https://www.makemytrip.com/");
        webdriverUtiles.click(SelectCity.CancelPoup);

        webdriverUtiles.clickonjs(SelectCity.CancelPoup2);

        webdriverUtiles.type(SelectCity.From,"Jaipur");
        webdriverUtiles.selectValuefromDropdown(SelectCity.Fromdropdown,"Jaipur Airport");


        System.out.println("TestCase1");
        System.out.println("TestCase2");
        System.out.println("TestCase3");
        System.out.println("TestCase4");

        System.out.println("CherryPick");

        System.out.println("CherryPick1");










    }



}

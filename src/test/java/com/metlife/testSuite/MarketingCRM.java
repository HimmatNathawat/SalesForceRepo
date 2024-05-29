package com.metlife.testSuite;

import PageObject.*;
import Utilites.WebdriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import data.LoginandPassData;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static Utilites.WebdriverUtils.driver;

public class MarketingCRM extends SetupTeardown {
    @Test(priority = 1, dataProviderClass = LoginandPassData.class, dataProvider = "LoginData")
    public void loginWithValid(String User, String Pass) throws InterruptedException, IOException {
        WebdriverUtils.navigate("https://mindful-narwhal-q4gq7v-dev-ed.trailblaze.my.salesforce.com/");
        WebdriverUtils.type(Login.User_name, User);
        WebdriverUtils.type(Login.Password, Pass);
        WebdriverUtils.click(Login.login);

        try {
            WebdriverUtils.screenshot(driver,"login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }


    @Test(priority = 2)
    public void App_launcher() throws InterruptedException {
        WebdriverUtils.click(App_Launcher.app_Icon);
        WebdriverUtils.click(App_Launcher.all_Apps);
        try {
            WebdriverUtils.screenshot(driver,"App_launcher");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEMmmmmmmmmmmm", "Login passssssssssss");
    }

    @Test(priority = 3)
    public static void MarketingCRM() throws InterruptedException {

        WebdriverUtils.click(Marketing_crm.ClickOnMarketing_CRM);
        String ComText = WebdriverUtils.getText(Marketing_crm.CompareHomePage);
        Assert.assertEquals(ComText, "Marketing CRM Classic");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 4)
    public void Click_NewLead_Drpodown() throws InterruptedException {

        try {
            WebdriverUtils.click(LeadModule.ClickOnDropDown);
        } catch (StaleElementReferenceException e) {
            WebdriverUtils.click(LeadModule.ClickOnDropDown);
        }
        WebdriverUtils.clickonjs(LeadModule.get_text_new_Lead);
        String msg = WebdriverUtils.getText(LeadModule.Lead_Information);
        SoftAssert ass = new SoftAssert();
       ass.assertEquals (msg, "New Lead");
        System.out.println(msg);

        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 5)
    public void Click_on_LeadInformation() throws InterruptedException {
        String InfomationName = WebdriverUtils.getText(LeadModule.infoName);
        Assert.assertEquals(InfomationName, "Lead Information");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 6)
    public void Lead_infomation_Page() throws InterruptedException {
        WebdriverUtils.ScrollintoView(LeadModule.Last_name);
        WebdriverUtils.type(LeadModule.Last_name, "Himmat Nathawat");
        WebdriverUtils.type(LeadModule.Company, "Metlife");
        WebdriverUtils.click(LeadModule.Lead_Save_Button);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 7)
    public void click_on_WithoutEnterDetails() throws InterruptedException {
        WebdriverUtils.click(LeadModule.ClickOnDropDown);
        WebdriverUtils.clickonjs(LeadModule.get_text_new_Lead);
        WebdriverUtils.clickonjs(LeadModule.click_without_Dtails);
        String worng = WebdriverUtils.getText(LeadModule.click_On_LeadSaveButton);
        Assert.assertEquals(worng, "We hit a snag.");
        WebdriverUtils.click(LeadModule.cancel_button);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 8)
    public void Click_onMainLeads() throws InterruptedException {
        WebdriverUtils.clickonjs(LeadModule.click_on_main_LeadManu);
        String leads = WebdriverUtils.getText(LeadModule.Get_LeadsText);
        Assert.assertEquals(leads, "My Leads");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 9)
    public void Delete_leads() throws InterruptedException {
        try {
            WebdriverUtils.clickonjs(LeadModule.click_on_ActionDropDown);
        } catch (TimeoutException e) {
            driver.navigate().refresh();
            WebdriverUtils.clickonjs(LeadModule.click_on_ActionDropDown);
        }
        WebdriverUtils.clickonjs(LeadModule.lead_delete_dropdown);
        WebdriverUtils.click(LeadModule.lead_delete_button);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 10)
    public void Click_on_contactDropdown() throws InterruptedException {
        WebdriverUtils.click(ContactModule.contact_dropdownClick);
        String Con = WebdriverUtils.getText(ContactModule.get_text_newContact);
        System.out.println(Con);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 11)

    public void Click_on_NewContect() throws InterruptedException {
        Thread.sleep(3000);
        WebdriverUtils.clickonjs(ContactModule.get_text_newContact);
        String cont = WebdriverUtils.getText(ContactModule.contect_info);
        Assert.assertEquals(cont, "Contact Information");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 12)

    public void Contect_form() throws InterruptedException {
        Thread.sleep(3000);
        WebdriverUtils.clickonjs(ContactModule.contect_lastname);
        WebdriverUtils.type(ContactModule.contect_lastname, "HimmatSingh");
        WebdriverUtils.click(ContactModule.contect_savebtn);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 13)

    public void Contect_formError_velidation() throws InterruptedException {
        WebdriverUtils.click(ContactModule.contact_dropdownClick);
        Thread.sleep(3000);
        WebdriverUtils.clickonjs(ContactModule.get_text_newContact);
        Thread.sleep(3000);
        WebdriverUtils.click(ContactModule.contect_errorvali);
        String ContSave = WebdriverUtils.getText(ContactModule.Error_msg);
        Assert.assertEquals(ContSave, "We hit a snag.");
        WebdriverUtils.click(ContactModule.contact_cancel);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 14)
    public void click_on_MainContect_() throws InterruptedException {
        WebdriverUtils.clickonjs(ContactModule.contect_click);
        String conts = WebdriverUtils.getText(ContactModule.my_contect_validation);
        Assert.assertEquals(conts, "Contacts");
    }

    @Test(priority = 15)
    public void Opportunity_Dropdown() throws InterruptedException {
        WebdriverUtils.click(OpportunityModule.opportunity_Dropdown);
        WebdriverUtils.clickonjs(OpportunityModule.Opportunity_myOpp);
        String opp = WebdriverUtils.getText(OpportunityModule.Opportunity_myOpp);
        SoftAssert asset = new SoftAssert();
        asset.assertEquals(opp, "New Opportunity");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 16)

    public void Click_onMyOpp() throws InterruptedException {
        String Oppor = WebdriverUtils.getText(OpportunityModule.Opportunity_info);
        Assert.assertEquals(Oppor, "Opportunity Information");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 17)

    public void opp_form() throws InterruptedException {
        WebdriverUtils.type(OpportunityModule.opp_name, "QA Automation");
        WebdriverUtils.type(OpportunityModule.opp_Closedate, "20/03/2024");
        WebdriverUtils.clickonjs(OpportunityModule.opp_stage);
        Thread.sleep(300);
           WebdriverUtils.WithoutClickjs(OpportunityModule.opp_Prospecting);

        WebdriverUtils.click(OpportunityModule.opp_saveBtn);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 18)
    public void Opp_formErrorVali() throws InterruptedException {
        WebdriverUtils.click(OpportunityModule.opportunity_Dropdown);
        WebdriverUtils.clickonjs(OpportunityModule.Opportunity_myOpp);
        WebdriverUtils.clickonjs(OpportunityModule.opp_saveBtn);
        Thread.sleep(5000);
        String Coninfosave = WebdriverUtils.getText(OpportunityModule.opp_error);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Coninfosave, "We hit a snag.");
        WebdriverUtils.click(OpportunityModule.Cancle_button);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");

    }

    @Test(priority = 19)
    public void Opp_vali() throws InterruptedException {
        WebdriverUtils.clickonjs(OpportunityModule.opp_Opportunities);
        String OppHomepage = WebdriverUtils.getText(OpportunityModule.opp_oppPage);
        Assert.assertEquals(OppHomepage, "Opportunities");
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 20)
    public void opp_delete() throws InterruptedException {
        Thread.sleep(3000);
       try{
           WebdriverUtils.clickonjs(OpportunityModule.opp_ActionDrop);
       }
       catch (TimeoutException e){
           driver.navigate().refresh();
           WebdriverUtils.click(OpportunityModule.opp_ActionDrop);

       }
        WebdriverUtils.clickonjs(OpportunityModule.opp_delete);
        WebdriverUtils.click(OpportunityModule.opp_deleteBtn);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

    @Test(priority = 21)

    public void LogOut() throws InterruptedException {

        WebdriverUtils.click(LogOut.profile_icon);
        WebdriverUtils.click(LogOut.logout_button);
        test = extent.startTest("Markating CEM", "   Login Test Pass");
        test.log(LogStatus.PASS, "Marketing CEM", "Login pass");
    }

}


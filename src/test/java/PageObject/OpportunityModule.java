package PageObject;

import org.openqa.selenium.By;

public class OpportunityModule {

    public static By opportunity_Dropdown = By.xpath("(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small' and @focusable='false' ])[4]");

    public static By Opportunity_myOpp = By.xpath("//span[text()= 'New Opportunity']");
    public static By Opportunity_info = By.xpath("//span[text()='Opportunity Information']");
    public static By opp_name = By.xpath("//input[@name='Name']");
    public static By opp_Closedate = By.xpath("//input[@name='CloseDate']");
    public static By opp_stage = By.xpath("(//button[starts-with(@id,'combobox-button') ])[3]");
    public static By opp_Prospecting = By.xpath("(//span[@class='slds-media__figure slds-listbox__option-icon'])[3]");
    public static By opp_saveBtn = By.xpath("//button[@name='SaveEdit']");
    public static By opp_error = By.xpath("//h2[text()='We hit a snag.']");
    public static By Cancle_button = By.xpath("//button[@name='CancelEdit']");
    public static By opp_Opportunities = By.xpath("//span[text()='Opportunities']");
    public static By opp_oppPage = By.xpath("//div/span[text()='Opportunities']");
    public static By opp_ActionDrop = By.xpath("//a[contains(@class,'rowActionsPlaceHolder ')]");
    public static By opp_delete = By.xpath("//a/div[text()='Delete']");
    public static By opp_deleteBtn = By.xpath("//span[text()='Delete']");

}

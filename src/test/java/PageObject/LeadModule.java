package PageObject;

import org.openqa.selenium.By;

public class LeadModule {

    public static By ClickOnDropDown = By.xpath("(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small' and @part='icon'])[2]");

    public static By get_text_new_Lead = By.xpath("//span[text()='New Lead']");

    public static By Lead_Information = By.xpath("//span[text()='Lead Information']");

    public static By infoName = By.xpath("(//span[contains(@class,'test-id__section-header')])[1]");

    public static By Last_name = By.xpath("//input[@name='lastName']");

    public static By Company = By.xpath("//input[@class='slds-input' and @name='Company']");
    public static By Lead_Save_Button = By.xpath("//button[@class='slds-button slds-button_brand']");

    public static By click_without_Dtails = By.xpath("//button[contains(@class,'slds-button slds-button_brand')]");
    public static By click_On_LeadSaveButton = By.xpath("//h2[text()='We hit a snag.']");
    public static By click_on_main_LeadManu = By.xpath("//span[text()='Leads']");
    public static By Get_LeadsText = By.xpath("//h1/span[text()='My Leads']");
    public static By click_on_ActionDropDown = By.xpath("(//div[@class='slds-truncate']/descendant::button[contains(@type,'button')])[5]");

    public static By lead_delete_dropdown = By.xpath("//a/div[@title='Delete' and text()='Delete']");

    public static By lead_delete_button = By.xpath("//span[text()='Delete']");

    public static By cancel_button = By.xpath("//button[text()='Cancel']");

}
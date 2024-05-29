package PageObject;

import org.openqa.selenium.By;

public class ContactModule {

public static By contact_dropdownClick = By.xpath("(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small' and @focusable='false' ])[3]");

public static By get_text_newContact = By.xpath("//span[text()='New Contact']");

public static By contect_info = By.xpath("//span[text()='Contact Information']");
public static By contect_lastname = By.xpath("//input[@name='lastName']");

public static By contect_savebtn = By.xpath("//button[@name='SaveEdit']");
public static By contact_cancel = By.xpath("//button[@name='CancelEdit']");
public static By contect_errorvali = By.xpath("//*[text()='Save']");
      //  By.xpath("//button[@name='SaveEdit']");

public static By Error_msg = By.xpath("//h2[text()='We hit a snag.']");
public static By contect_cancelBtn = By.xpath("//button[@name='CancelEdit']");
public static By contect_click = By.xpath("//span[text()='Contacts']");
public static By my_contect_validation = By.xpath("//p[@class='slds-page-header__name-meta' and text()='Contacts']");

public static By contect_Action_dropdown =By.xpath("(//div[@class='slds-truncate']/descendant::button[contains(@type,'button')])[6]");
public static By contect_delete_dropdown = By.xpath("//a[@title='Delete']");
public static By contect_deleteBtn = By.xpath("//span[text()='Delete']");
}

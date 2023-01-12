package pages;

import elements.Dropdown;
import elements.Input;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage {

    private final static String LEAD_DETAILS_LOCATOR = "//*[contains(@class, 'slds-show')]//span[text()='%s']" +
        "/ancestor::records-record-layout-item//*[@data-output-element-id='output-field'];";

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }



    public Lead getLeadDetails() {
        Lead.LeadBuilder lead = new Lead.LeadBuilder("");
        return lead;
    }



}




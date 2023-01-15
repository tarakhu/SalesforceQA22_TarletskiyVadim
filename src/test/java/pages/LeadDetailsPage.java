package pages;

import elements.RecordLayoutItem;
import enums.*;
import models.Lead;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage {

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    public Lead getLeadDetails() {
        Lead.LeadBuilder lead = new Lead.LeadBuilder(new RecordLayoutItem(driver, "Name").getValue(),
                LeadStatus.fromString(new RecordLayoutItem(driver, "Lead Status").getValue()),
                new RecordLayoutItem(driver, "Company").getValue())
                .setFullAddress(new RecordLayoutItem(driver, "Address").getValue())
                .setIndustry(Industry.fromString(new RecordLayoutItem(driver, "Industry").getValue()))
                .setNumberOfEmployees(Integer.valueOf(new RecordLayoutItem(driver, "No. of Employees").getValue()))
                .setAnnualRevenue(new RecordLayoutItem(driver, "Annual Revenue").getValue().substring(1))
                .setPhone(Integer.valueOf(new RecordLayoutItem(driver, "Phone").getValue()))
                .setEmail(new RecordLayoutItem(driver, "Email").getValue())
                .setWebsite(new RecordLayoutItem(driver, "Website").getValue())
                .setSalutation(Salutations.fromString(new RecordLayoutItem(driver, "Website").getValue()))
                .setRating(Rating.fromString(new RecordLayoutItem(driver, "Rating").getValue()))
                .setLeadSource(LeadSource.fromString(new RecordLayoutItem(driver, "Lead Source").getValue()))
                .setDescription(new RecordLayoutItem(driver, "Description").getValue());
                return lead.build();


    }





}




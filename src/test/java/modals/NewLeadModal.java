package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal {

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead lead) {
        new Input(driver, "First Name").setValue(lead.getFirstName());
        new Input(driver, "Last Name").setValue(lead.getLastName());
        new Input(driver, "Company").setValue(lead.getCompany());
        new Input(driver, "City").setValue(lead.getCity());
        new Input(driver, "Zip/Postal Code").setValue(String.valueOf(lead.getPostalCode()));
        new Input(driver, "State/Province").setValue(lead.getProvince());
        new Input(driver, "Country").setValue(lead.getCountry());
        new Input(driver, "No. of Employees").setValue(String.valueOf(lead.getNumberOfEmployees()));
        new Input(driver, "Annual Revenue").setValue(String.valueOf(lead.getAnnualRevenue()));
        new Input(driver, "Phone").setValue(String.valueOf(lead.getPhone()));
        new Input(driver, "Email").setValue(lead.getEmail());
        new Input(driver, "Website").setValue(lead.getWebsite());
        new Dropdown(driver, "Industry").setDropdownValue(lead.getIndustry().getName());
        new Dropdown(driver, "Lead Status").setDropdownValue(lead.getLeadStatus().getName());
        new Dropdown(driver, "Salutation").setDropdownValue(lead.getSalutation().getName());
        new Dropdown(driver, "Rating").setDropdownValue(lead.getRating().getName());
        new Dropdown(driver, "Lead Source").setDropdownValue(lead.getLeadSource().getName());
        new TextArea(driver, "Street").setTextAreaValue(lead.getStreet());
        new TextArea(driver, "Description").setTextAreaValue(lead.getDescription());

    }
}